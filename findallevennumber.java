/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evennumber;

import java.util.Scanner;

/**
 *
 * @author Salman
 */
public class findallevennumber {
     public static void main(String []args)
    {
        int n=0,i=0;
         
        Scanner X = new Scanner(System.in);
         
        System.out.print("Enter value n : ");
        n = X.nextInt();
         
        for(i=1; i<n; i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
        }   
        System.out.println();
         
    }
    
    
}
