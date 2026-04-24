# Quantum Car Factory
 
A simple Java project that demonstrates clean object-oriented design using a **Car Factory system** with interchangeable engine types.
  
## Features 
- Supports multiple engine types:
 
 
  - Gas Engine
 
  - Electric Engine
 
  - Hybrid Engine (Gas + Electric)
 

 
 
- Car operations:
 
 
  - `start()` → starts engine at speed 0
 
  - `stop()` → stops engine (after resetting speed to 0)
 
  - `accelerate()` → increases speed by 20 km/h (max 200)
 
  - `brake()` → decreases speed by 20 km/h
 

 
 
- Engine behavior:
 
 
  - Each engine maintains its own internal speed
 
  - Engines respond to car speed changes
 

 
 
- Hybrid engine logic:
 
 
  - Uses **Electric Engine** below 50 km/h
 
  - Uses **Gas Engine** at 50 km/h and above
 
  - Never runs both engines simultaneously (cost-optimized)
 

 
 
- Factory capabilities:
 
 
  - Create cars with different engine types
 
  - Replace engine of an existing car at runtime
 

 
 

  
## Project Structure
```text
com.quantumcar
├── domain
│   ├── car
│   │   └── Car.java
│   └── engine
│       ├── Engine.java
│       ├── EngineType.java
│       └── impl
│           ├── GasEngine.java
│           ├── ElectricEngine.java
│           └── HybridEngine.java
├── factory
│   └── CarFactory.java
└── Main.java
```
## Design Concepts Used
 
 
- **Factory Pattern** `CarFactory` creates cars based on engine type
 
 
- **Strategy Pattern** `Engine` interface allows interchangeable engine implementations
 
 
- **Encapsulation** Engine logic is hidden inside implementations
 
 
- **Composition** Hybrid engine contains both gas and electric engines
 
 

  
## How to Run
 
 
1. Clone the repository: `git clone https://github.com/AbdelrahmanMohamed01/Quantum-Car.git ` 
 
2. Open the project in your IDE (IntelliJ / Eclipse)
 
 
3. Run:
 
 
## Author
 
**Abdelrahman Mohamed** Backend Developer (Java / Spring Boot)
