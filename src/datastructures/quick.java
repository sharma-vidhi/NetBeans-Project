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
import java.util.*;
public class quick {
   public static void swap (int A[], int x, int y) {
      int temp = A[x];
      A[x] = A[y];
      A[y] = temp;
   }
 
   public static int partition(int A[], int f, int l) {
      int pivot = A[f];
      while (f < l) {
         while (A[f] < pivot) f++;
         while (A[l] > pivot) l--;
         swap (A, f, l);
      }
      return f;
   }
 
   public static void Quicksort(int A[], int f, int l) {
      if (f >= l) return;
      int pivotIndex = partition(A, f, l);
      Quicksort(A, f, pivotIndex);
      Quicksort(A, pivotIndex+1, l);
   
   }
public static void main(String argv[]) {
      //int []numbers={55,2,93,1,23,10,66,12,7,54,3};
      
   

    int n, c, d, swap;
    Scanner in = new Scanner(System.in);
    
 
    System.out.println("enter max  number of integers to be sorted");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (c = 0; c < n; c++) 
      array[c] = in.nextInt();
    System.out.println(Arrays.toString(array));
      Quicksort(array, 0, array.length-1);
      System.out.println(Arrays.toString(array));
}
}
