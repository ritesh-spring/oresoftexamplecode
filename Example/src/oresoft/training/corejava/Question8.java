/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
    * Qusetion 8: Determine the name of the package in runtime.
 */
package oresoft.training.corejava;


public class Question8 {

     public static void main(String[] args) {
     
        Question8 obj = new Question8();
        Package pack = obj.getClass().getPackage();
        String packageName = pack.getName();
        System.out.println("Package Name = " + packageName);
     }

}
