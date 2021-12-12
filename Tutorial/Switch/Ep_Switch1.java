package Java;

import java.io.*;

public class Ep_Switch1
{
    public static void main(String args[]) throws IOException
    {
        String inputChoice = "BufferedReader";

        int choice;
        
        BufferedReader keyInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t//////////////////////"); 
        System.out.println("\tPress 1 to make a balance inquiry"); 
        System.out.println("\tPress 2 to make a deposit");
        System.out.println("\tPress 3 to make a withdrawal"); 
        System.out.println("\tPress 4 to quit"); 
        System.out.println("\t//////////////////////"); 
        System.out.print("Please select the menu: "); 
        inputChoice = keyInput.readLine(); 
        choice = Integer.parseInt(inputChoice); 

        switch(choice) 
        {
            case 1: System.out.println("You are making a balance inquiry"); 
            break;

            case 2: 
            System.out.println("You are making a deposit");
            break; 

            case 3: 
            System.out.println("You are making a withdrawal");
            break; 

            default: 
            break;


        }
    }
}
