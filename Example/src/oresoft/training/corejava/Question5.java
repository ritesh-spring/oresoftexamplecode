/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oresoft.training.corejava;

public class Question5 {

    public static void main(String[] args)
    {
        String property = "java.io.tmpdir";
        String tempDir = System.getProperty(property);
        System.out.println("current temporary directory is " + tempDir);
    }
}