/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class Car {

    public String make;
    public int yearModel;
    public int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public int getyearModel() {
        return yearModel;
    }

    public int acceleration(int i) {
        speed = speed + 5;
        System.out.println("A" + (i+1) +": " + speed);
        return speed;
    }

    public int breaking(int j) {
        speed = speed - 5;
        System.out.println("B" + (j+1) + ": " + speed);
        return speed;
    }

}
