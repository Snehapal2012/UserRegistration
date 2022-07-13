package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationWithExceptionTest {
    @Test
    public void userFirstNameTest() throws InvalidFirstName{
        UserRegistrationWithException user=new UserRegistrationWithException();
        boolean result=user.userFirstName("Sneha");
        Assertions.assertTrue(result);
        try{Assertions.assertTrue(user.userFirstName("Sneha"));
            System.out.println("Valid First name");}catch (InvalidFirstName e){
            System.out.println("Invalid First name: "+e);
        }
    }
    @Test
    public void userFirstNameTestFalse() throws InvalidFirstName {
        UserRegistrationWithException user = new UserRegistrationWithException();
        boolean result = user.userFirstName("neha");
        Assertions.assertFalse(result);
        try{Assertions.assertFalse(user.userFirstName("neha"));
            System.out.println("Valid First name");}catch (InvalidFirstName e){
            System.out.println("Invalid First name: "+e);
        }
    }
    @Test
    public void userLastNameTestTrue() throws InvalidLastNameException{
        UserRegistrationWithException user=new UserRegistrationWithException();
        boolean result=user.userLastName("Pal");
        Assertions.assertTrue(result);
        try{
            Assertions.assertTrue(user.userLastName("Pal"));
            System.out.println("Valid Last name");}catch (InvalidLastNameException e){
            System.out.println("Invalid Last name: "+e);
        }
    }
    @Test
    public void userLastNameTestFalse() throws InvalidLastNameException{
        UserRegistrationWithException user=new UserRegistrationWithException();
        boolean result=user.userLastName("pal");
        Assertions.assertFalse(result);
        try{
            Assertions.assertFalse(user.userLastName("pal"));
            System.out.println("Valid Last name");}catch (InvalidLastNameException e){
            System.out.println("Invalid Last name: "+e);
        }
    }
    @Test
    public void userEmailTestTrue() throws InvalidEmailException{
        UserRegistrationWithException user=new UserRegistrationWithException();
        boolean result=user.email("abc@yahoo.com");
        Assertions.assertTrue(result);
        try{
            Assertions.assertTrue(user.email("abc@yahoo.com"));
            System.out.println("Valid email");}catch (InvalidEmailException e){
            System.out.println("Invalid email: "+e);
        }
    }
    @Test
    public void userEmailTestFalse()throws InvalidEmailException{
        UserRegistrationWithException user=new UserRegistrationWithException();
        boolean result=user.email("1@yahoo.com");
        Assertions.assertFalse(result);
        try{
            Assertions.assertFalse(user.email("abc@yahoo.com"));
            System.out.println("Valid email");}catch (InvalidEmailException e){
            System.out.println("Invalid email: "+e);
        }
    }
    @Test
    public void userMobileTestTrue()throws InvalidMobileNumberException{
        UserRegistrationWithException user=new UserRegistrationWithException();
        boolean result=user.mobile("91 9674783976");
        Assertions.assertTrue(result);
        try{
            Assertions.assertTrue(user.mobile("91 9674783976"));
            System.out.println("Valid mobile number");}catch (InvalidMobileNumberException e){
            System.out.println("Invalid mobile number: "+e);
        }
    }
    @Test
    public void userMobileTestFalse()throws InvalidMobileNumberException{
        UserRegistrationWithException user=new UserRegistrationWithException();
        boolean result=user.mobile("91  967478376");
        Assertions.assertFalse(result);
        try{
            Assertions.assertFalse(user.mobile("91 9674783976"));
            System.out.println("Valid mobile number");}catch (InvalidMobileNumberException e){
            System.out.println("Invalid mobile number: "+e);
        }
    }
    @Test
    public void userPasswordTestTrue()throws InvalidPasswordException{
        UserRegistrationWithException user=new UserRegistrationWithException();
        boolean result=user.password("S@123pal");
        Assertions.assertTrue(result);
        try{
            Assertions.assertTrue(user.password("S@123pal"));
            System.out.println("Valid password");}catch (InvalidPasswordException e){
            System.out.println("Invalid password: "+e);
        }
    }
    @Test
    public void userPasswordTestFalse() throws InvalidPasswordException{
        UserRegistrationWithException user=new UserRegistrationWithException();
        boolean result=user.password("s@12al");
        Assertions.assertFalse(result);
        try{
            Assertions.assertFalse(user.password("S@123pal"));
            System.out.println("Valid password");}catch (InvalidPasswordException e){
            System.out.println("Invalid password: "+e);
        }
    }
}
