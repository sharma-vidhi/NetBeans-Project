/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bubblesort {
     public static void main(String []args) {
   int n, c, d, swap;
    Scanner in = new Scanner(System.in);
    
 
    System.out.println("enter max  number of integers to be sorted");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (c = 0; c < n; c++) 
      array[c] = in.nextInt();
 
    for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (array[d] > array[d+1]) 
        {
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }
 
    System.out.println("Sorted list of numbers");
 
    for (c = 0; c < n; c++) 
      System.out.println(array[c]);
  }
    
}
