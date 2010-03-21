/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/* Question 6: Write a Program to decode a string to an integer. The input string
 * could be in various format like hexa or octal.
 */
package oresoft.training.corejava;


public class Question6 {

      public static void main(String[] args) {
        String decimal = "10";    // Decimal
        String hexa    = "0XFF";  // Hexa
        String octal   = "077";   // Octal

        Integer number = Integer.decode(decimal);
        System.out.println("String [" + decimal + "] = " + number);

        number = Integer.decode(hexa);
        System.out.println("String [" + hexa + "] = " + number);

        number = Integer.decode(octal);
        System.out.println("String [" + octal + "] = " + number);
    }


}
