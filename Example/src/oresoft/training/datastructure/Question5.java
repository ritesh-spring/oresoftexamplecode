/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Assume you have an array of integers as follows
 * Integer[] numbers = {7, 7, 8, 9, 10, 8, 8, 9, 6, 5, 4};
 * Write a program that will eiminate the duplicates in the above array.
 * The expected output should be
 *     4, 5, 6, 7, 8, 9, 10
 */
package oresoft.training.datastructure;

import java.util.*;


public class Question5 {
public static void main(String[] args) {
        Integer[] numbers = {7, 7, 8, 9, 10, 8, 8, 9, 6, 5, 4};

        List list = Arrays.asList(numbers);
        Set set = new HashSet(list);

        for (Iterator iterator = set.iterator(); iterator.hasNext();) {
            Object o = iterator.next();
            System.out.print(o + ", ");
        }
    }

}
