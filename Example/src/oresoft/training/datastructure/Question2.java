/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Find out the What date, month, year, day-of-week, day-of-month, day-of-year is it today?
 * The sample output should be as follows.
 * 
 Current Date: Sun Feb 28 15:53:49 PST 2010
Day: 28
Month: 2
Year: 2010
Day of Week: 1
Day of Month: 28
Day of Year: 59
 */
package oresoft.training.datastructure;

import java.util.Calendar;


public class Question2 {
public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        int dom = cal.get(Calendar.DAY_OF_MONTH);
        int doy = cal.get(Calendar.DAY_OF_YEAR);

        System.out.println("Current Date: " + cal.getTime());
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println("Day of Week: " + dow);
        System.out.println("Day of Month: " + dom);
        System.out.println("Day of Year: " + doy);
    }

}
