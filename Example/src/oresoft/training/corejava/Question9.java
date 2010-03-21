/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Question 9: What is wrong in the following program and what is the way to compare the string.
 */
package oresoft.training.corejava;


public class Question9 {
 public static void main(String[] args)
    {
        String s1 = "Hello World";
        String s2 = new String("Hello World");


        if (s1 == s2)
        {
            System.out.println("String is equal");
        }
        else
        {
            System.out.println("String is unequal");
        }
    }
     // Do not use the == operator to compare string for it's content, the ==
        // operator check return true only if the object has the same reference. This
        // process will return false as the string references to a different object.
        // use (s1.equals(s2) API
}
