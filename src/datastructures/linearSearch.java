/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
 
class linearSearch 
{
  public static void main(String args[])
  {
    int c, n, search, array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = in.nextInt(); 
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
 
    System.out.println("Enter value to find");
    search = in.nextInt();
 
    for (c = 0; c < n; c++)
    {
      if (array[c] == search)    
      {
         System.out.println(search + " is present at location " + (c + 1) + ".");
          break;
      }
   }
   if (c == n) 
      System.out.println(search + " is not present in array.");
  }
}