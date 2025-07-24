package NotifyMe.src.Observable;

import NotifyMe.src.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StocksObservable{
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount;
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        stockCount = stockCount;
        notifySubscribers();
    }

    @Override
    public void getStockCount() {
    }
}
