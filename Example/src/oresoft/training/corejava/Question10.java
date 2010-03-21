/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Write a program to extract numbers from the following string "M/74 Baramunda H.B , BBSR 751003"
 * The output should be 74751003.
 *
 */
package oresoft.training.corejava;

public class Question10 {

      public static void main(String[] args)
    {
        String str = "M/74 Baramunda H.B , BBSR 751003";
        StringBuffer numStr = new StringBuffer();
        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
            {
               numStr.append(str.charAt(i));
            }
        }

        System.out.println("The Number string is "  + numStr);
    }


}
