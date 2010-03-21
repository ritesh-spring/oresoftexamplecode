/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oresoft.training.corejava;
import java.io.File;


public class Question3 {

    public static void main(String[] args) {

        if ( args.length < 1 ) {
            System.out.println("Please give the file name to check");
            System.exit(1);
        }
        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("the file does not exists");
        } else {
            System.out.println("the file does exists");
        }


        }
    }



