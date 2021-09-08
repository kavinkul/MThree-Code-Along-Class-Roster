/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.codealongclassroster.ui;

import java.util.Scanner;

/**
 *
 * @author kavin
 */
public class UserIOConsoleImpl implements UserIO {
    private Scanner sc = new Scanner(System.in);
    
    @Override
    public void print(String message){
        System.out.println(message);
    }
    
    @Override
    public String readString(String prompt){
        System.out.println(prompt);
        String receivedString = sc.nextLine();
        return receivedString;
    }
    
    @Override
    public int readInt(String prompt){
        int receivedInt;
        while (true){
            try {
                System.out.println(prompt);
                receivedInt = Integer.parseInt(sc.nextLine());
                return receivedInt;
            }
            catch (NumberFormatException e){
                System.out.println("This is not an integer. Please try again.");
            }
        }
    }
    
    @Override
    public int readInt(String prompt, int min, int max){
        int receivedInt;
        while (true){
            try {
                System.out.println(prompt);
                receivedInt = Integer.parseInt(sc.nextLine());
                if (receivedInt >= min && receivedInt <= max)
                    return receivedInt;
                else
                    System.out.println("Your integer is not in range of " + min + " - " + max + ". Please try again.");
            }
            catch (NumberFormatException e){
                System.out.println("This is not an integer. Please try again.");
            }
        }
    }
    
    @Override
    public double readDouble(String prompt){
        double receivedDouble;
        while (true){
            try {
                System.out.println(prompt);
                receivedDouble = Double.parseDouble(sc.nextLine());
                return receivedDouble;
            }
            catch (NumberFormatException e){
                System.out.println("This is not a double. Please try again.");
            }
        }
    }
    
    @Override
    public double readDouble(String prompt, double min, double max){
        double receivedDouble;
        while (true){
            try {
                System.out.println(prompt);
                receivedDouble = Double.parseDouble(sc.nextLine());
                if (receivedDouble >= min && receivedDouble <= max)
                    return receivedDouble;
                else
                    System.out.println("Your double is not in range of " + min + " - " + max + ". Please try again.");
            }
            catch (NumberFormatException e){
                System.out.println("This is not a double. Please try again.");
            }
        }
    }
        
    @Override
    public float readFloat(String prompt){
        float receivedFloat;
        while (true){
            try {
                System.out.println(prompt);
                receivedFloat = Float.parseFloat(sc.nextLine());
                return receivedFloat;
            }
            catch (NumberFormatException e){
                System.out.println("This is not a float. Please try again.");
            }
        }
    }
    
    @Override
    public float readFloat(String prompt, float min, float max){
        float receivedFloat;
        while (true){
            try {
                System.out.println(prompt);
                receivedFloat = Float.parseFloat(sc.nextLine());
                if (receivedFloat >= min && receivedFloat <= max)
                    return receivedFloat;
                else
                    System.out.println("Your float is not in range of " + min + " - " + max + ". Please try again.");
            }
            catch (NumberFormatException e){
                System.out.println("This is not a float. Please try again.");
            }
        }
    }
            
    @Override
    public long readLong(String prompt){
        long receivedLong;
        while (true){
            try {
                System.out.println(prompt);
                receivedLong = Long.parseLong(sc.nextLine());
                return receivedLong;
            }
            catch (NumberFormatException e){
                System.out.println("This is not a long. Please try again.");
            }
        }
    }
    
    @Override
    public long readLong(String prompt, long min, long max){
        long receivedLong;
        while (true){
            try {
                System.out.println(prompt);
                receivedLong = Long.parseLong(sc.nextLine());
                if (receivedLong >= min && receivedLong <= max)
                    return receivedLong;
                else
                    System.out.println("Your long is not in range of " + min + " - " + max + ". Please try again.");
            }
            catch (NumberFormatException e){
                System.out.println("This is not a long. Please try again.");
            }
        }
    }
}
