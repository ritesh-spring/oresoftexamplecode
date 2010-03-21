/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * You have given a parameter file ( C:\temp\param.txt with following contents
 *   city=Bhubaneswar
 *   State=Orissa
 *   Country=India
 * Read the above file and print the city, state, country name.
 */
package oresoft.training.corejava;

import java.io.*;
import java.io.FileReader;

public class Question12 {

    public static void main(String[] args)
    {
        File file = new File("C:\\temp\\param.txt");
        BufferedReader reader = null;

        try
        {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            // repeat until all lines is read
            while ((text = reader.readLine()) != null)
            {
                String[] items = text.split("=");
                if (items[0].equalsIgnoreCase("city"))
                    System.out.println("the city name is " + items[1]) ;
                if (items[0].equalsIgnoreCase("state"))
                    System.out.println("the state name is " + items[1]) ;
                if (items[0].equalsIgnoreCase("country"))
                    System.out.println("the country name is " + items[1]) ;

            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }



}
