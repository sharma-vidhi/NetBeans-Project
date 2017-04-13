/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
import java.util.ArrayList;
import java.util.Scanner;
 
public class VariableLengthArray<T>
{
    private int size;
    private ArrayList<T> array;
 
    public VariableLengthArray()
    {
        array = new ArrayList<T>();
        setSize(-1);
    }
 
    public void setSize(int size)
    {
        this.size = size;
    }
 
    public int getSize()
    {
        return size;
    }
 
    public void store(int index, T value)
    {
        try 
        {
            array.set(index, value);
        } catch (IndexOutOfBoundsException indexOutBounds)
        {
            if (index >= 0 && !(index < size))
            {
                throw new IndexOutOfBoundsException();
            }
            array.add(index, value);
        }
    }
 
    public T get(int index)
    {
        try
        {
            if (index >= 0 && index < size)
                return array.get(index);
            else
                throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException indexOutBounds)
        {
            System.out.println("index out of bound");
        }
        return null;
    }
 
    public T remove(int index)
    {
        try 
        {
            if (index >= 0 && index < size)
            {
                size--;
                return array.remove(index);
            } else
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException indexOutBounds)
        {
            System.out.println("index out of bound");
        }
        return null;
    }
 
    public static void main(String args[])
    {
        int size, value;
        String choice;
        Scanner scanner = new Scanner(System.in);
 
        VariableLengthArray<Integer> integersArray = new VariableLengthArray<Integer>();
 
        do
        {
            System.out.println("Enter the size of the array");
            size = scanner.nextInt();
 
            integersArray.setSize(size);
            System.out.println("Enter the values of the array");
            for (int index = 0; index < integersArray.getSize(); index++)
            {
                value = scanner.nextInt();
                integersArray.store(index, value);
            }
 
            System.out.println("The Values entered are ");
            for (int index = 0; index < integersArray.getSize(); index++)
            {
                System.out.print(integersArray.get(index) + "\t");
            }
 
            System.out.println("\nEnter more values ?[y/n]");
            choice = scanner.next();
        } while (choice.equals("y"));
        scanner.close();
    }
}
