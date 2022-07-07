package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserFirstName {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program!");
        userFirstName();
    }
    public static void  userFirstName(){
        String name;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter First name: ");
        name=scan.nextLine();
        String regex="^[A-Z]{1}[a-z]{2,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(name);
        boolean result=m.matches();
        if(result)
        {
            System.out.println("First name is Valid");
        }else {
            System.out.println("First name is Invalid");
        }
    }
}
