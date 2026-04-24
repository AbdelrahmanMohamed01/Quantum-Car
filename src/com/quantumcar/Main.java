package com.quantumcar;

import com.quantumcar.domain.car.Car;
import com.quantumcar.domain.engine.Engine;
import com.quantumcar.domain.engine.EngineType;
import com.quantumcar.factory.CarFactory;

public class Main {
    public static void main(String[] args) {
        Car gasCar= CarFactory.createCar(EngineType.GAS);
        System.out.println(">>>>>> Gas car created");
        testCar(gasCar);

        System.out.println("---------------------------------");

        Car electricCar= CarFactory.createCar(EngineType.ELECTRIC);
        System.out.println(">>>>>> Electric car created");
        testCar(electricCar);

        System.out.println("---------------------------------");

        Car hybridCar= CarFactory.createCar(EngineType.HYBRID);
        System.out.println(">>>>>> Hybrid car created");
        testCar(hybridCar);

        System.out.println("---------------------------------");

        //Switching gasCar to HybridCar
        System.out.println(">>>>>> Installing HybridEngine to a GasCar:");
        CarFactory.installEngine(gasCar,EngineType.HYBRID);
        testCar(gasCar);
    }
    private static void testCar(Car car){
        car.start();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.stop();
    }
}
