package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean userFirstName(String name1) {
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(name1);
        boolean result1 = m1.matches();
        if (result1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean userLastName(String name){
        String regex="^[A-Z]{1}[a-z]{2,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(name);
        boolean result=m.matches();
        if (result){
            return true;
        }else{
           return false;
        }
    }
    public boolean email(String email){
        String regex="^[a-z]{3,}[A-Za-z0-9+_$%^&#.-]{0,}+@(.+)[a-z0-9.]{2,9}[a-z.]{0,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(email);
        boolean result=m.matches();
        if(result){
            return true;
        }else {
            return false;
        }
    }
    public boolean mobile(String mobile){
        String regex="^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(mobile);
        boolean result=m.matches();
        if(result){
           return true;
        }else{
           return false;
        }
    }
    public boolean password(String password){
        String regex="^[A-Z]{1,}[A-Za-z0-9.@#$%^&*-_+.!]{7,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(password);
        boolean result=m.matches();
        if(result){
            return true;
        }else{
            return false;
        }
    }
}
