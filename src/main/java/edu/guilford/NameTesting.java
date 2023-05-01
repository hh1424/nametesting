package edu.guilford;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class NameTesting 
{
    public static void main( String[] args )
    {
        //Create an array of 10 FullName objects
        FullName[] names = new FullName[10];
        //Fill the array with FullName objects
        for(int i = 0; i < names.length; i++){
            names[i] = new FullName();
        }
        //Print out the array of FullName objects
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        FullName.sortOrder = FullName.SortOrder.REVERSE;
        //Sort the array of FullName objects using Arrays.sort
        Arrays.sort(names);

        System.out.println("\nAfter sorting:");
        //Print out the array of FullName objects
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
