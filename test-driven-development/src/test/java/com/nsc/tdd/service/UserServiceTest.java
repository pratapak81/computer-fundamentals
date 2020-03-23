package com.nsc.tdd.service;

import com.nsc.tdd.AppUtils;
import com.nsc.tdd.exception.MandatoryParametersMissingException;
import com.nsc.tdd.exception.UserAlreadyExistException;
import com.nsc.tdd.model.User;
import com.nsc.tdd.repository.UserRepository;
import com.nsc.tdd.repository.UserRepositoryImpl;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

// orElse @Mock will not work
@RunWith(PowerMockRunner.class)
@PrepareForTest(value = {AppUtils.class, UserService.class, UserRepositoryImpl.class})
//@RunWith(MockitoJUnitRunner.class) // use only when running Mockito
public class UserServiceTest {

    private UserService userService;

    @Mock
    private UserRepository userRepositoryMock;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup() {
        userService = new UserService(userRepositoryMock);
    }

    @Test
    public void test_add_success() throws Exception {
        User user = new User("123", "Pratap");

        when(userRepositoryMock.insert(user)).thenReturn(new User("123", "Pratap"));

        // good to call variable as result
        User result = userService.add(user);

        // verifying the mock, always verify
        Mockito.verify(userRepositoryMock).insert(user);
        Mockito.verify(userRepositoryMock, times(1)).insert(user);
        //Mockito.verify(userRepositoryMock, atLeastOnce()).insert(user);
        //Mockito.verify(userRepositoryMock, atLeast(1)).insert(user);
        //Mockito.verify(userRepositoryMock, atMostOnce()).insert(user);
        //Mockito.verify(userRepositoryMock, atMost(1)).insert(user);
        //Mockito.verify(userRepositoryMock, never()).insert(user);

        // if we want verify order of the calling, userRepo first and then another service
        //InOrder inOrder = Mockito.inOrder(userRepositoryMock, otherMock);
        //inOrder.verify(userRepositoryMock).insert(user);
        //inOrder.verify(otherMock).methodName(parameter);

        assertNotNull(result);
        assertEquals(user.getId(), result.getId());
        assertEquals(user.getName(), result.getName());
    }

    //@Test(expected = MandatoryParametersMissingException.class)
    @Test
    public void test_add_input_null() throws Exception {
        expectedException.expect(MandatoryParametersMissingException.class);
        expectedException.expectMessage("User can't be null");
        userService.add(null);
    }

    @Test
    public void test_add_existing_user() throws Exception {
        User user = new User("123", "Pratap");

        when(userRepositoryMock.insert(user)).thenReturn(new User("123", "Pratap")).thenThrow(new UserAlreadyExistException("User already exist"));

        expectedException.expect(UserAlreadyExistException.class);
        expectedException.expectMessage("User already exist");

        userService.add(user);
        userService.add(user);

        Mockito.verify(userRepositoryMock, times(2)).insert(user);
    }

    @Test
    public void test_add_unable_to_insert() throws Exception {
        User user = new User("222", "Name"); // consider this can't be inserted
        when(userRepositoryMock.insert(user)).thenReturn(null);

        //Mockito.verify(userRepositoryMock, times(1)).insert(user);
        //Mockito.verify(userRepositoryMock, atMostOnce()).insert(user);

        expectedException.expect(Exception.class);
        expectedException.expectMessage("Unable to add User. Please try again later");

        userService.add(user);

        Mockito.verify(userRepositoryMock, times(1)).insert(user);
    }

    @Test
    public void test_add_user_argument_captor() throws Exception {

        when(userRepositoryMock.insert(Mockito.any(User.class))).thenReturn(new User("Id", "Name"));

        User result = userService.add("222", "Pratap");

        assertNotNull(result);
        assertEquals("Id", result.getId());
        assertEquals("Name", result.getName());

        ArgumentCaptor<User> userArgumentCaptor = ArgumentCaptor.forClass(User.class);
        Mockito.verify(userRepositoryMock, times(1)).insert(userArgumentCaptor.capture());

        User capturedUser = userArgumentCaptor.getValue();

        assertNotNull(capturedUser);
        assertEquals("222", capturedUser.getId());
        assertEquals("Pratap", capturedUser.getName());
    }

    @Test
    public void test_get_application_name() {
        // static mocking
        PowerMockito.mockStatic(AppUtils.class);
        PowerMockito.when(AppUtils.getAppName()).thenReturn("Test Driven Development");

        String result = userService.getApplicationName();

        PowerMockito.verifyStatic(AppUtils.class);
        /**
         * without this
         * org.mockito.exceptions.misusing.UnfinishedVerificationException:
         * Missing method call for verify(mock) here:
         */
        AppUtils.getAppName();

        assertNotNull(result);
        assertEquals("Test Driven Development", result);
    }

    @Test
    public void test_create_user() throws Exception {
        User user = new User("222", "Pratap");
        PowerMockito.whenNew(User.class).withAnyArguments().thenReturn(user);

        User result = userService.createUser();

        assertNotNull(result);
        assertEquals("222", result.getId());
        assertEquals("Pratap", result.getName());
    }

    @Test
    public void test_get_user_count() throws Exception {
        UserRepositoryImpl spy = PowerMockito.spy(new UserRepositoryImpl());
        PowerMockito.when(spy, "getCount").thenReturn(15);

        /*PowerMockito.doReturn(mockPoint)
                .when(powerMockDemoSpy, "privateMethod", anyBoolean());*/

        int count = spy.getUserCount();

        assertEquals(15, count);
        PowerMockito.verifyPrivate(spy, Mockito.times(1)).invoke("getCount");
    }

    @After
    public void tearDown() {
        userService = null;
    }
}
