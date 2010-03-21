/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Write a program that will find out number of days between 30-Dec-2010 and 8-may-2008. 
 */
package oresoft.training.datastructure;

import java.util.Calendar;


public class Question4 {
     public static void main(String[] args)
    {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.set(2010, 12, 30);
        cal2.set(2008, 5, 8);

        long milis1 = cal1.getTimeInMillis();
        long milis2 = cal2.getTimeInMillis();

        long diff =  milis1 - milis2;

        long diffDays = diff / (24 * 60 * 60 * 1000);

        System.out.println("In days: " + diffDays + " days.");
    }



}
