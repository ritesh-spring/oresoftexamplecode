/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Assume you have following array with 4 string elements
 * String[] arr = {"Hello", "World" , "Good" , "Morning"}.
 * Write a java program that will convert the above array into an collection
 * and print all the elements of collection using iterator.
 */
package oresoft.training.datastructure;

import java.util.*;


public class Question3 {

    public static void main(String[] args)
    {
        String[] arr = {"Hello", "World" , "Good" , "Morning"};
        List list = Arrays.asList(arr);

        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println((String) iterator.next());
        }
    }

}
