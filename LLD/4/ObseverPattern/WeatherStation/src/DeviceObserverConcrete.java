package WeatherStation.src;

public class DeviceObserverConcrete implements DeviceObserver{

    WeatherStationObservable weatherstation;

    DeviceObserverConcrete(WeatherStationObservable weatherStation) {
        this.weatherstation = weatherStation;
    }
    @Override
    public void update() {
        System.out.println("Temperature changed");
    }
}
