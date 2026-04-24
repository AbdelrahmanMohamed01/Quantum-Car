package com.quantumcar.domain.engine.impl;

import com.quantumcar.domain.engine.Engine;

public class ElectricEngine implements Engine {
    private int speed;

    @Override
    public void start() {
        speed=0;
        System.out.println("ElectricEngine is running");
    }

    @Override
    public void stop() {
        speed=0;
        System.out.println("ElectricEngine stopped");
    }

    @Override
    public void increase() {
        speed++;
        System.out.println("ElectricEngine is running on speed: "+speed);
    }

    @Override
    public void decrease() {
        speed--;
        System.out.println("ElectricEngine is running on speed: "+speed);
    }

    @Override
    public void setSpeed(int speed) {
        this.speed=speed;
        System.out.println("ElectricEngine is running on speed: "+speed);
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
