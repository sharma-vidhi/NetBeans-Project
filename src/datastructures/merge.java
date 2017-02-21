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
public class merge {
    public static void main(String args[]) {
      int n, c, d, swap;
    Scanner in = new Scanner(System.in);
    
 
    System.out.println("enter max  number of integers to be sorted");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (c = 0; c < n; c++) 
      array[c] = in.nextInt();
    
    
    System.out.println("before: " + Arrays.toString(array));
    mergeSort(array);
    System.out.println("after:  " + Arrays.toString(array));
  }
 
  public static void mergeSort(int[] array) {
    if (array.length > 1) {
      int[] left = leftHalf(array);
      int[] right = rightHalf(array);
 
      mergeSort(left);
      mergeSort(right);
 
      merge(array, left, right);
    }
  }
 
  public static int[] leftHalf(int[] array) {
    int size1 = array.length / 2;
    int[] left = new int[size1];
    for (int i = 0; i < size1; i++) {
      left[i] = array[i];
    }
    return left;
  }
 
  public static int[] rightHalf(int[] array) {
    int size1 = array.length / 2;
    int size2 = array.length - size1;
    int[] right = new int[size2];
    for (int i = 0; i < size2; i++) {
      right[i] = array[i + size1];
    }
    return right;
  }
 
  public static void merge(int[] result, int[] left, int[] right) {
    int i1 = 0;  
    int i2 = 0; 
 
    for (int i = 0; i < result.length; i++) {
      if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
        result[i] = left[i1]; 
        i1++;
      } else {
        result[i] = right[i2]; 
        i2++;
      }
    }
  }
}
 

