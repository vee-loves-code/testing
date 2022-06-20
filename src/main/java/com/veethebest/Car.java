package com.veethebest;

public class Car {

    private String tyret;
    private String steering;
    private String wheels;

    public Car(String tyre){
        tyret = tyre;
    }

    public String getTyret() {
        return tyret;
    }

    public void setTyret(String tyret) {
        this.tyret = tyret;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void iMove() {
        System.out.println("Hello");
    }
}
