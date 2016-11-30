/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculator;

/**
 *
 * @author Selesky
 */

import java.util.Scanner;
        
public class JavaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your first number: ");
        double numb = input.nextDouble();
        
        System.out.print("Type out your second number: ");
        double numb2 = input.nextDouble();
        
        double answer = numb + numb2;
        System.out.println("Your answer is " + answer);
    }
    
}
