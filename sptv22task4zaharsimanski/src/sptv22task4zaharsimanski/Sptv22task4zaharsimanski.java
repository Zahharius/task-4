/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22task4zaharsimanski;
import java.util.Arrays;
/**
 *
 * @author Zaharu-sos
 */
public class Sptv22task4zaharsimanski {
    public static void main(String[] args) {
        int[] array = new int[100];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 50) * 2 + 1;
        }
        System.out.println("NO SORT");
          int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.printf("%3d", array[i]);
            if ((i+1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("SORT");
           Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.printf("%3d", array[i]);
            if ((i+1) % 10 == 0) {
                System.out.println();
            }
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double)sum / array.length;
        
        System.out.println("\nСреднее арифметическое: " + average);
    }
}