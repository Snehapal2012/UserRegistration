package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidEmails {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program!");
        System.out.println("Enter 1 : to validate First name");
        System.out.println("Enter 2 : to validate Last name");
        System.out.println("Enter 3 : to validate Email");
        System.out.println("Enter 4 : to validate mobile number");
        System.out.println("Enter 5 : to validate password ");
        Scanner scan=new Scanner(System.in);
        switch (scan.nextInt()){
            case 1: userFirstName();
                break;
            case 2: userLastName();
                break;
            case 3: email();
                break;
            case 4: mobile();
                break;
            case 5: password();
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
    public static void userFirstName(){
        String name1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter First name: ");
        name1=scan.nextLine();
        String regex1="^[A-Z]{1}[a-z]{2,}$";
        Pattern p1=Pattern.compile(regex1);
        Matcher m1=p1.matcher(name1);
        boolean result1=m1.matches();
        if(result1)
        {
            System.out.println("First name is Valid");
        }else {
            System.out.println("First name is Invalid");
        }
    }
    public static void userLastName(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Last Name: ");
        String name=scan.nextLine();
        String regex="^[A-Z]{1}[a-z]{2,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(name);
        boolean result=m.matches();
        if (result){
            System.out.println("Last name is Valid");
        }else{
            System.out.println("Last name is Invalid");
        }
    }
    public static void email(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter email id: ");
        String email=scan.nextLine();
        String regex="^[a-z]{3,}[A-Za-z0-9+_$%^&#.-]{0,}+@(.+)[a-z0-9.]{2,9}[a-z.]{0,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(email);
        boolean result=m.matches();
        if(result){
            System.out.println("Email is valid");
        }else {
            System.out.println("Email is invalid");
        }
    }
    public static void mobile(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String number=scan.nextLine();
        String regex="^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(number);
        boolean result=m.matches();
        if(result){
            System.out.println("Mobile number is valid");
        }else{
            System.out.println("Mobile number is invalid");
        }
    }
    public static void password(){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password= scan.nextLine();
        String regex="^[A-Z]{1,}[A-Za-z0-9.@#$%^&*-_+.!]{7,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(password);
        boolean result=m.matches();
        if(result){
            System.out.println("Password is valid");
        }else{
            System.out.println("Password is invalid");
        }

    }
}
