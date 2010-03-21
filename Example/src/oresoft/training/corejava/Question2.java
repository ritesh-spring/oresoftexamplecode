/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oresoft.training.corejava;

public class Question2 {
public static void main(String[] args)
    {
       if ( args.length < 2 ) {
            System.out.println("Use java Question2 <string name> <delimeter name>");
            System.exit(1);
        }
        String data = args[0];
        String delim = args[1] ;
        String[] items = data.split(delim);
        int i = 1 ;
        for (String item : items)
        {
            System.out.println("Token # " + i + " is =" + item);
            i++ ;
        }
    }

}
