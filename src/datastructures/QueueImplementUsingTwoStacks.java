package data.structures;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
import java.util.*;
 

class queueUsingStack
{
    Stack<Integer> s ;
    Stack<Integer> tmp ;
 
    
    public queueUsingStack()
    {
        s = new Stack<Integer>();
        tmp = new Stack<Integer>();
    }
    
    public void insert(int data)
    {
                 
        if (s.size() == 0)
            s.push(data);
        else
        {   
                  
            int l = s.size();
            for (int i = 0; i < l; i++)
                tmp.push(s.pop());                   
                         
            s.push(data);            
                         
            for (int i = 0; i < l; i++)
                s.push(tmp.pop());                   
        }
    }    
    
    public int remove()
    {
        if (s.size() == 0)
            throw new NoSuchElementException("Underflow Exception");            
        return s.pop();
    }    
    
    public int peek()
    {
        if (s.size() == 0)
            throw new NoSuchElementException("Underflow Exception");            
        return s.peek();
    }        
    
    public boolean isEmpty()
    {
        return s.size() == 0 ;
    }    
    
    public int getSize()
    {
        return s.size();
    }    
    
    public void display()
    {
        System.out.print("\nQueue = ");
        int l = getSize();
        if (l == 0)
            System.out.print("Empty\n");
        else
        {
            
            for (int i = l - 1; i >= 0; i--)
                System.out.print(s.get(i)+" ");                
            System.out.println();
        }
    }
}
 

public class QueueImplementUsingTwoStacks
{    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);    
        
        queueUsingStack qus = new queueUsingStack();            
             
        System.out.println("Queue Using Two Stacks Test\n"); 
        char ch;         
        do
        {
            System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");            
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                qus.insert( scan.nextInt() );                 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Removed Element = "+ qus.remove() );
                }
                catch (Exception e) 
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+ qus.peek() );
                }
                catch (Exception e) 
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                          
            case 4 : 
                System.out.println("Empty status = "+ qus.isEmpty() );
                break;                
            case 5 : 
                System.out.println("Size = "+ qus.getSize() );
                break;                          
            default : 
                System.out.println("Wrong Entry \n ");
                break;    
            }                
                   
            qus.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');                                                            
    } 
}
