package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationWithException {
    public boolean userFirstName(String name1) throws InvalidFirstName {
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(name1);
        boolean result1 = m1.matches();
        if (!result1) {
            throw new InvalidFirstName("First name should start with caps and should have min 3 letters");
        }else
        return true;
    }
    public boolean userLastName(String name)throws InvalidLastNameException{
        String regex="^[A-Z]{1}[a-z]{2,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(name);
        boolean result=m.matches();
        if (!result){
            throw new InvalidLastNameException("Last name should starts with caps and should have min 3 letters");
        }else{
            return true;
        }
    }
    public boolean email(String email) throws InvalidEmailException{
        String regex="^[a-z]{3,}[A-Za-z0-9+_$%^&#.-]{0,}+@(.+)[a-z0-9.]{2,9}[a-z.]{0,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(email);
        boolean result=m.matches();
        if(!result){
            throw new InvalidEmailException("Email should have @ and . ");
        }else {
            return true;
        }
    }
    public boolean mobile(String mobile)throws InvalidMobileNumberException{
        String regex="^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(mobile);
        boolean result=m.matches();
        if(!result){
            throw new InvalidMobileNumberException("Country code followed by space and 10 digit number");
        }else{
            return true;
        }
    }
    public boolean password(String password)throws InvalidPasswordException{
        String regex="^[A-Z]{1,}[A-Za-z0-9.@#$%^&*-_+.!]{7,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(password);
        boolean result=m.matches();
        if(!result){
            throw new InvalidPasswordException("Password should have atleast one caps, small latter, special character, number and should be min 8 in size");
        }else{
            return true;
        }
    }
}
