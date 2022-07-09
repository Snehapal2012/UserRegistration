package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {

@Test
    public void userFirstNameTestTrue(){
    UserRegistration user=new UserRegistration();
    boolean result=user.userFirstName("Sneha");
    Assertions.assertTrue(result);
}
@Test
    public void userFirstNameTestFalse() {
        UserRegistration user = new UserRegistration();
        boolean result = user.userFirstName("sneha");
        Assertions.assertFalse(result);
    }
@Test
    public void userLastNameTestTrue(){
    UserRegistration user=new UserRegistration();
    boolean result=user.userLastName("Pal");
    Assertions.assertTrue(result);
}
@Test
public void userLastNameTestFalse(){
    UserRegistration user=new UserRegistration();
    boolean result=user.userLastName("pal");
    Assertions.assertFalse(result);
}
@Test
public void userEmailTestTrue(){
    UserRegistration user=new UserRegistration();
    boolean result=user.email("abc@yahoo.com");
    Assertions.assertTrue(result);
}
    @Test
    public void userEmailTestFalse(){
        UserRegistration user=new UserRegistration();
        boolean result=user.email("1@yahoo.com");
        Assertions.assertFalse(result);
    }
    @Test
    public void userMobileTestTrue(){
    UserRegistration user=new UserRegistration();
    boolean result=user.mobile("91 9674783976");
    Assertions.assertTrue(result);
    }
    @Test
    public void userMobileTestFalse(){
        UserRegistration user=new UserRegistration();
        boolean result=user.mobile("91  967478376");
        Assertions.assertFalse(result);
    }
    @Test
    public void userPasswordTestTrue(){
    UserRegistration user=new UserRegistration();
    boolean result=user.password("S@123pal");
    Assertions.assertTrue(result);
    }
    @Test
    public void userPasswordTestFalse(){
        UserRegistration user=new UserRegistration();
        boolean result=user.password("s@12al");
        Assertions.assertFalse(result);
    }
}
