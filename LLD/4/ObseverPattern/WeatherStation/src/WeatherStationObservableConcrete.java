package WeatherStation.src;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservableConcrete implements WeatherStationObservable{
    List<DeviceObserver> deviceObservers = new ArrayList<>();
    int current;
//    WeatherStationObservableConcrete(Wea) {
//
//    }
//
    @Override
    public void add(DeviceObserver deviceObserver) {
        this.deviceObservers.add(deviceObserver);
    }

    @Override
    public DeviceObserver remove(DeviceObserver deviceObserver) {
        return null;
    }

    @Override
    public void notifyObservers() {
        for (DeviceObserver deviceObserver : deviceObservers) {
            deviceObserver.update();
        }
    }

    @Override
    public void setData(int temp ) {
        current = temp;
        notifyObservers();
    }
}
