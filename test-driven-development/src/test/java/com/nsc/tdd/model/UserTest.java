package com.nsc.tdd.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTest {

    private ObjectMapper objectMapper;

    @Before
    public void setup() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void test_user_structure_success() throws JsonProcessingException {
        String userString = "{\"Id\":\"123\",\"name\":\"Pratap\"}";
        User user = new User("123", "Pratap");

        String result = objectMapper.writeValueAsString(user);
        String toStringResult = user.toString();

        // Verification
        assertEquals(userString, result);
        assertEquals(userString, toStringResult);
    }

    /*
    Whenever I override equals and hash code, I write unit tests that follow Joshua Bloch's recommendations in "Effective Java" Chapter 3.
    I make sure that equals and hash code are reflexive, symmetric, and transitive.
    I also make sure that "not equals" works properly for all the data members.
    When I check the call to equals, I also make sure that the hashCode behaves as it should
    */
    @Test
    public void test_hashcode_and_equals() {
        User user1 = new User("123", "Pratap");
        User user2 = new User("123", "Pratap");

        assertTrue(user1.equals(user2) && user2.equals(user1));
        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @After
    public void teardown() {
        // after each test configurations
        objectMapper = null;
    }

}
