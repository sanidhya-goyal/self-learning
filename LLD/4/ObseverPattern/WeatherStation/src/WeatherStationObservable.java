package WeatherStation.src;

import java.util.List;

public interface WeatherStationObservable {

    void add(DeviceObserver deviceObserver);
    DeviceObserver remove(DeviceObserver deviceObserver);
    void notifyObservers();
    void setData(int temp);
}
