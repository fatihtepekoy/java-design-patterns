package designpatterns.structural.facade;

public class EngineFacade {

    private AirFlowSystem airFlowSystem = new AirFlowSystem();
    private CoolingSystem coolingSystem = new CoolingSystem();
    private FireSystem fireSystem = new FireSystem();
    private FuelPumpSystem fuelPumpSystem = new FuelPumpSystem();
    private InjectorPressureSystem injectorPressureSystem = new InjectorPressureSystem();


    public void startEngine() {
        injectorPressureSystem.start();
        airFlowSystem.start();
        fuelPumpSystem.start();
        fireSystem.start();
        coolingSystem.start();
    }

    public void stopEngine() {
        coolingSystem.stop();
        fuelPumpSystem.stop();
        fireSystem.stop();
        injectorPressureSystem.stop();
        airFlowSystem.stop();
    }
}