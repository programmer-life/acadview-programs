/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patern;

/**
 *
 * @author Salman
 */
public class patternstyle2 {
    public static void main(String []args){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++)
            {
                if(i<j)
              System.out.print("*") ; 
            }
            System.out.println();
        }
    }
    
}
