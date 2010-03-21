/*
Write a Java Program to Reverse String.
Assuming that your program is Question1.java then Test with following inputs.
 Test Case 1:
 ************
 Java Question1 Hello
 olleH
 Test Case 2:
 ***********
 Java Question1 “Good Morning”
 gninroM doo
 */

package oresoft.training.corejava;
public class Question1 {
     public static void main(String[] args)
    {
        if ( args.length < 1 ) {
            System.out.println("Please give one to reverse");
            System.exit(1);
        }
        String reverse = new StringBuffer(args[0]).reverse().toString();
        System.out.println("Normal : " + args[0]);
        System.out.println("Reverse: " + reverse);
    }




}
