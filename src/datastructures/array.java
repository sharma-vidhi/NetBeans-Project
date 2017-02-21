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

public class array {
    public static void main(String args[]){
        int[] Arr=new int[10];
         
        Arr[1] = 1;
        Arr[2] =2 ;
        Arr[3] =4 ;
        Arr[4] =6 ;
        Arr[5] =7 ;
        Arr[6] =8 ;
        Arr[7] = 9;
        Arr[8] = 0;
        Arr[9] = 3;
        Arr[0] = 5;
        
        int searchkey,j;
         
        
        for(j=0;j<10;j++)
        {
            System.out.println(Arr[j]+"");
        }
        System.out.println("enter the searchkey");
        Scanner scan=new Scanner(System.in);
        int i =scan.nextInt();
        
        
       
        for(j=0;j<10;j++)
        {
            if(Arr[j] == i)
           break;
           
        }
        
        if(j == 10) 
        System.out.println("Can’t find " + i); 
        else
        System.out.println("Found " + i); 
        
        
    }
            
}
