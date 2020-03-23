package com.nsc.tdd.service;

import com.nsc.tdd.exception.MandatoryParametersMissingException;
import com.nsc.tdd.exception.UserAlreadyExistException;
import com.nsc.tdd.model.User;
import com.nsc.tdd.repository.UserRepository;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

// orElse @Mock will not work
@RunWith(MockitoJUnitRunner.class)
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
    public void test_add_success() {
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

        assertNotNull(result);
        assertEquals(user.getId(), result.getId());
        assertEquals(user.getName(), result.getName());
    }

    //@Test(expected = MandatoryParametersMissingException.class)
    @Test
    public void test_add_input_null() {
        expectedException.expect(MandatoryParametersMissingException.class);
        expectedException.expectMessage("User can't be null");
        userService.add(null);
    }

    @Test(expected = UserAlreadyExistException.class)
    @Ignore
    public void test_add_existing_user() {
        User user = new User("123", "Pratap");

    }

    @After
    public void tearDown() {

    }
}
