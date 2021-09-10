package org.example;


import javax.swing.text.PasswordView;
import javax.swing.text.html.BlockView;
import java.util.Scanner;
import java.io.*;

import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App 
{
    static Scanner in = new Scanner(System.in);
    public static void main( String[] args )
    {
        App pass = new App();
        String passs = pass.pass();
        if(passs.equals("abc$123")) out.print("Welcome!");
        else out.println("I don't know you.");

        //System.out.println( "Hello World!" );
    }
    private String pass(){
        out.print("What is the password? ");
        return in.next();
    }
}
