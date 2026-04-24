package com.quantumcar.domain.engine.impl;

import com.quantumcar.domain.engine.Engine;

public class HybridEngine implements Engine {
    private final ElectricEngine electricEngine;
    private final GasEngine gasEngine;
    private Engine operatingEngine;
    private int speed;

    public HybridEngine(){
        this.electricEngine=new ElectricEngine();
        this.gasEngine=new GasEngine();
    }


    @Override
    public void start() {
        speed=0;
        operatingEngine=electricEngine;
        operatingEngine.start();
        System.out.println("HybridEngine is running");
    }

    @Override
    public void stop() {
        speed=0;
        operatingEngine.stop();
        System.out.println("HybridEngine stopped");
    }

    @Override
    public void increase() {
        speed++;
        if(speed<50){
            operatingEngine=electricEngine;
        }
        else{
            operatingEngine=gasEngine;
        }
        operatingEngine.increase();
        System.out.println("HybridEngine is running on speed: "+speed);
    }

    @Override
    public void decrease() {
        speed--;
        if(speed<50){
            operatingEngine=electricEngine;
        }
        else {
            operatingEngine = gasEngine;
        }
        operatingEngine.decrease();
        System.out.println("HybridEngine is running on speed: "+speed);
    }

    @Override
    public void setSpeed(int speed) {
        Engine current=(this.speed<50) ? electricEngine : gasEngine;
        if(speed>=50 && current==electricEngine){
            operatingEngine.stop();
            operatingEngine=gasEngine;
        }
        else if(speed<50 && current==gasEngine){
            operatingEngine.stop();
            operatingEngine=electricEngine;
        }
        this.speed=speed;
        operatingEngine.setSpeed(speed);
        System.out.println("HybridEngine is running on speed: "+speed);
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
