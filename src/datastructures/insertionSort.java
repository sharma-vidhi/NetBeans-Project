package datastructures;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

import java.util.Scanner;

public class insertionSort {
 
   public static void main(String args[]) {
      int n, c, d, swap;
    Scanner in = new Scanner(System.in);
    
 
    System.out.println("enter max  number of integers to be sorted");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (c = 0; c < n; c++) 
      array[c] = in.nextInt();
 
      System.out.print("Before:  " );
      for(int x: array) { 
         System.out.print(x + " ");
      }
      System.out.println(" ");
 
      int tmp;
      for (int i = 1; i < array.length; i++) {
         for(int j = i ; j > 0 ; j--) {
            if(array[j] < array[j-1]) {
               tmp = array[j];
               array[j] = array[j-1];
               array[j-1] = tmp;
            }
         }
         System.out.print("pass " + i + ":  " );
         for(int x: array) {
            System.out.print(x + " ");
         }
         System.out.println(" ");
      }
     
   }
}