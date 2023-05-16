/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
1. define a character array c
2. ask user input a string
3. take length of user input as the size of the array
4. ask user input number for left shift n
5. use a loop to perform the shift
*/

package arraystringshift;
/*import javax.swing.*;

public class ArrayStringShift {


    public static char[] shift(char[] array, int amount){
        for(int i = 0; i < amount; i++){
            char ch = array[0];
            int j;
            for(j = 0; j < array.length-1; j++)
                array[j] = array[j+1];
             array[j] = ch;           
        }
        return array;
    }

    public static void main(String[] args) {
        String answer;
        do{
            String input = JOptionPane.showInputDialog("Enter a string: ");
            char[] inputArray = input.toCharArray();
            
            int number = Integer.parseInt(JOptionPane.showInputDialog("Input the number of shifts:"));
            String shiftedArray = new String(shift(inputArray,number));
            
            JOptionPane.showMessageDialog(null,"Original String = " + input +"\n" +"Shifted String = "
                    + shiftedArray +"\n "+ "Number of Shifts = " + number + "\n","Shifted String",JOptionPane.PLAIN_MESSAGE);
            
            answer = JOptionPane.showInputDialog("Do you want to quit?");
        }while(!"y".equalsIgnoreCase(answer));
        
     }  
} */

import java.util.Scanner;
public class ArrayStringShift {
    
     public static final Scanner keyboard = new Scanner(System.in);
    
    static int IntegerInputValidation(String str_input)
    {
      int intNum;
      
      while(true)
      {

       try {
        intNum = Integer.parseInt(str_input);
        break;
        } 
        catch (NumberFormatException nfe) 
        {
            System.out.println(str_input + " is not a valid number");
        
        }
        
      System.out.println("Input the number of shifts: ");
      str_input = keyboard.next();
      
      }
      return intNum;
} 
   
    public static char[] shift(char[] array, int amount)
    {
        
        for(int i = 0; i < amount; i++)
        {
            char ch =  array[0];
            int j;
            for(j=0; j < array.length - 1; j++)
                array[j] = array[j+1];
            array[j] = ch;
        }
        
        return array;
    }
    
    public static void main(String args[]) {
        
        char answer;
      
        do
        {
            System.out.println("Enter a string: ");
            String input = keyboard.nextLine();
            char[] inputArray = input.toCharArray();
            
            System.out.println("Input the number of shifts: ");
            String str_input = keyboard.next();
            int number  = IntegerInputValidation(str_input);
            
            
            String shiftedArray = new String(shift(inputArray, number));
            
            System.out.println("Original String = " + input +"\n" +"Shifted String = "
                    + shiftedArray +"\n"+ "Number of Shifts = " + number);
                    
                    
            System.out.println("Do you want to quit?");
            answer = keyboard.next().charAt(0);
            
            keyboard.nextLine();
        } while(Character.toLowerCase(answer) != 'y' );
    }
}