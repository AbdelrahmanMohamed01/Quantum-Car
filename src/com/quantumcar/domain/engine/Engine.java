package com.quantumcar.domain.engine;

public interface Engine {
    void start();
    void stop();
    void increase();
    void decrease();
    void setSpeed(int speed);
    int getSpeed();
}
