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
import java.util.*;
public class selectionSort {
    public static void main(String args[]) {
      int n, c, d, swap;
    Scanner in = new Scanner(System.in);
    
 
    System.out.println("enter max number of integers to be sorted");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (c = 0; c < n; c++) 
      array[c] = in.nextInt();
    System.out.print("Start : " );     
      for(int x = 0; x < array.length; x++) {
         System.out.print( " " + array[x]);     
      }
      System.out.println(" "); 
 
      int first; 
      int tmp; 
      int count=1; 
      for ( int i=array.length-1; i>0; i--,count++ ) {
         first = 0;
         for(int j=1; j<=i; j++) {
            if( array[j] < array[first] )  
               first = j;
         }
         tmp = array[first]; 
         array[first] = array[i];
         array[i] = tmp; 
 
      System.out.print("Pass " + count + ": " );
      for(int x = 0; x < array.length; x++) {
         System.out.print( " " + array[x]);
      }
      System.out.println(" ");
 
 
      } 
   }
    
   
}
 

