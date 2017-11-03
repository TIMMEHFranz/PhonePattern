/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonepattern;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/**
 *
 * @author tfranz
 */
public class PhonePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pattern numP;
      numP = Pattern.compile("[(]?([0-9]{3})[)]?[' ']?[.]?[-]?([0-9]{3})[-]?[.]?([0-9]{4})");
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a Phone number");
      String number = in.nextLine();
      while(!number.equals(""))
      {
       Matcher numM = numP.matcher(number);
       if(numM.matches())
       {
           String numOne = numM.group(1);
           String numTwo = numM.group(2);
           String numThree = numM.group(3);
           System.out.println("("+ numOne + ") " + numTwo + "-" + numThree);
       }
       number = in.nextLine();
      }
      in.close();
    }
}

