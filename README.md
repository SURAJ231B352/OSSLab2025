# OSSLab2025

This repository contains lab exercises for the Open Source Software Lab - 2025



## Lab Exercise 1

Name: Suraj Kumar

Roll Number:231b352

Email: 231b352@juetguna.in

< Lab-1 Q solution GTA.java >

import java.util.Scanner;



public class GreaterNumber {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner scanner = new Scanner(System.in);



&nbsp;       // Input from the user

&nbsp;       System.out.print("Enter the first number: ");

&nbsp;       double num1 = scanner.nextDouble();



&nbsp;       System.out.print("Enter the second number: ");

&nbsp;       double num2 = scanner.nextDouble();



&nbsp;       // Find and print the greater number

&nbsp;       if (num1 > num2) {

&nbsp;           System.out.println(num1 + " is greater than " + num2);

&nbsp;       } else if (num2 > num1) {

&nbsp;           System.out.println(num2 + " is greater than " + num1);

&nbsp;       } else {

&nbsp;           System.out.println("Both numbers are equal.");

&nbsp;       }



&nbsp;       scanner.close();

&nbsp;   }

}



