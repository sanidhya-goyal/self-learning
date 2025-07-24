package WeatherStation.src;

public class Main {
    public static void main (String [] args) {
        WeatherStationObservable observable = new WeatherStationObservableConcrete();
        DeviceObserver observer = new DeviceObserverConcrete(observable);
        observable.add(observer);

        observable.setData(20);
    }
}
