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

    public class priorityQueue {
 
    @SuppressWarnings("rawtypes")
    private Comparable[] pQueue;
    private int index;
     
    public priorityQueue(int capacity){
        pQueue = new Comparable[capacity];
    }
     
    public void insert(Comparable item ){
        if(index == pQueue.length){
            System.out.println("The priority queue is full!! can not insert.");
            return;
        }
        pQueue[index] = item;
        index++;
        System.out.println("Adding element: "+item);
    }
     
    @SuppressWarnings("unchecked")
    public Comparable remove(){
        if(index == 0){
            System.out.println("The priority queue is empty!! can not remove.");
            return null;
        }
        int maxIndex = 0;
        
        for (int i=1; i<index; i++) {
            if (pQueue[i].compareTo (pQueue[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        Comparable result = pQueue[maxIndex];
        System.out.println("removing: "+result);
       
        index--;
        pQueue[maxIndex] = pQueue[index];
        return result;
    }
     
    public static void main(String a[]){
        priorityQueue pqi = new priorityQueue(5);
        pqi.insert(34);
        pqi.insert(23);
        pqi.insert(5);
        pqi.insert(87);
        pqi.insert(32);
        pqi.remove();
        pqi.remove();
        pqi.remove();
        pqi.remove();
        pqi.remove();
    }
}

