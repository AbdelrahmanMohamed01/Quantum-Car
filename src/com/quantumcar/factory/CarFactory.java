package com.quantumcar.factory;

import com.quantumcar.domain.car.Car;
import com.quantumcar.domain.engine.Engine;
import com.quantumcar.domain.engine.EngineType;
import com.quantumcar.domain.engine.impl.ElectricEngine;
import com.quantumcar.domain.engine.impl.GasEngine;
import com.quantumcar.domain.engine.impl.HybridEngine;

public class CarFactory {
    public static Car createCar(EngineType type){
        Car car=new Car();
        installEngine(car,type);
        return car;
    }
    private static Engine createEngine(EngineType type){
        switch (type){
            case GAS :
                return new GasEngine();
            case ELECTRIC:
                return new ElectricEngine();
            case HYBRID:
                return new HybridEngine();
            default:
                throw new IllegalArgumentException("unknown engine type");
        }
    }
    public static void installEngine(Car car,EngineType type){
        car.setEngine(createEngine(type));
    }
}
