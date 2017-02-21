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
import java.util.Stack;
 
public class sortingStack {
 
  public void sort(Stack<Integer> s){
 
    int x=0;
    if (!s.isEmpty()){
      x=s.pop();
      sort(s);
      insert(s,x);
    }
 
  }
 
  
  public void insert(Stack<Integer> s,int x){
 
      
    if (!s.isEmpty() && s.peek()>= x){
      int y=s.pop();
      insert(s, x);
      s.push(y);
    }else {
      s.push(x);
    }
  }
 
  public static void main(String[] a){
 
    sortingStack ss=new sortingStack();
 
    Stack<Integer> stack=new Stack<Integer>();
    stack.push(8);
    stack.push(30);
    stack.push(2);
    stack.push(66);
    stack.push(25);
    stack.push(13);
 
    ss.sort(stack);
    for(int val: stack){
      System.out.print(val + " ");
    }
    System.out.println();
 
  }
}
 