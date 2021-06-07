/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweetlana_pro.factorizer;

import java.util.Scanner;

/**
 *
 * @author Sweetlana Protsenko
 */
public class Factorizer {
    public static void main(String[] args) {
        int number, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you would like to factor ");
        number = sc.nextInt();
        System.out.print("The factors of " + number + " are: " );
        
        int numFactors = 0;
        for (int factor = 1; factor <= number; factor++) {
            if(number % factor == 0) {
                System.out.print(factor + " ");
               numFactors++;
            }
            
        }
        System.out.println("Total number of factors are: " + numFactors);
    }
    
}
