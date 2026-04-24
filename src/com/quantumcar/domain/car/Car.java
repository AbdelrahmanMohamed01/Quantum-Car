package com.quantumcar.domain.car;

import com.quantumcar.domain.engine.Engine;

public class Car {
    private Engine engine;
    private int speed;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        speed=0;
        engine.start();
    }
    public void stop(){
        speed=0;
        engine.stop();
    }
    public void accelerate(){
        System.out.println("ACCELERATE!!!");
        if(speed<200){
            speed+=20;
        }
        engine.setSpeed(speed);
    }
    public void brake(){
        System.out.println("BRAKE!!!");
        if(speed>20){
            speed-=20;
        }
        engine.setSpeed(speed);
    }
}
