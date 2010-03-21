/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Assume we have a file c:\temp\file1.txt with following lines
 *      red
        green
        blue
        yellow
        cyan
        white
        black

 * Write a java program that will read these colors from the text file and print the colors in a
 * sorted order. The output should be
 * black,
   blue,
   cyan,
   green,
   red,
   white,
   yellow

 * Hint: You can do in two ways 1) Using Collections.sort and storing in TreeSet.
 * Find out which method is more performing.
 */
package oresoft.training.datastructure;

import java.io.*;
import java.util.*;

public class Question1 {

    public static void main(String[] args) {

        File file = new File("C:\\temp\\file1.txt");
        BufferedReader reader = null;
        List colours = new ArrayList();
        
        try
        {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            // repeat until all lines is read
            while ((text = reader.readLine()) != null)
            {

                     colours.add(text) ;
            }
             } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        for (String item : set) {
            System.out.print(item + " ");
        }

        Collections.sort(colours);
        System.out.println(Arrays.toString(colours.toArray()));


    }

}
