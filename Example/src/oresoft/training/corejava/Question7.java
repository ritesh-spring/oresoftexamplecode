/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/* Question 7: Write a Program to replace a charater in string. If the input string
 *is Hello world then o/p string stould be Hellu Wurld.
 */
package oresoft.training.corejava;


public class Question7 {

    public static void main(String[] args) {
        String text = "Hello World";
        text = text.replace('o', 'u');
        System.out.println("Result: " + text);
    }


}
