/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Question 11: How to generate a random number between 1 to 10000.
 */
package oresoft.training.corejava;

public class Question11 {

    public static void main(String[] args)
    {
        /*
         * The following code will generate an random vaule between 0 to 1
         */
        double number = Math.random();
        System.out.println("Generated number: " + number);

       
        // Creates an integer random number
        int random =  100 + (int)(Math.random() * 10000);
        System.out.println("Generated number: " + random);
    }


}
