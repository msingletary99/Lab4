/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Car myCar= new Car();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please insert the year of your car.");
        int yearModel=Integer.parseInt(keyboard.nextLine());
        myCar.setYearModel(yearModel);
        
        System.out.println("Please insert the make of your car.");
        String make = keyboard.nextLine(); 
        myCar.setMake(make);
        
        System.out.println("Please insert your average speed of travel.");
        int speed = keyboard.nextInt();
        myCar.setSpeed(speed);
//        
        for(int i=0;i<5;i++){
            myCar.acceleration();
        }
        
        for(int j=0;j<5;j++){
            myCar.breaking();
    }
        
    }
}
