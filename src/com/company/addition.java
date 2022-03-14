package com.company;

import java.util.*;
class Addition
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        // FOR TAKING THE INPUT FORM THE USER WE NEED TO DECLARE SCANNER CLASS JAVA.UTIL.*
        System.out.print("Enter a string: ");
        String str= sc.nextLine();              //reads string
        System.out.print("You have entered: "+str);
    }
}