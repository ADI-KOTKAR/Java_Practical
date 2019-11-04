//Write a java programs to add n strings in a vector array.
//Input new string and check whether it is present in the vector. 
//If it is present delete it otherwise add it to the vector.
import java.lang.*;
import java.io.*;
import java.util.*;
public class Vector_Demo {
    void check(Vector list)
    {
        Scanner sc = new Scanner(System.in);
        String el;
        System.out.println("Enter the element to be checked: ");
        el = sc.nextLine();
        for(int i=0; i<list.size();i++)
        {
            if(el == list.get(i))
                System.out.println("This Element is already present at "+i+" position");
                list.remove(i);
        }
        System.out.println("Updated List");
        
        System.out.println(list);
      
    }
    public static void main(String args[])
	{
             Vector list = new Vector();
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter no. of elements: ");
             int n = sc.nextInt();
             String data[] = new String[n];
       
             for(int i=0;i<n;i++)
             {
                 System.out.println("Enter element: ");
                 data[i] = sc.nextLine();
                 list.addElement(data[i]);
             }
             System.out.println(list);
             
             Vector_Demo obj = new Vector_Demo();
             obj.check(list);
	}
}