package NotifyMe.src.Observable;

import NotifyMe.src.Observer.NotificationAlertObserver;

public interface StocksObservable {
    void add (NotificationAlertObserver notificationAlertObserver);
    void remove (NotificationAlertObserver notificationAlertObserver);
    void notifySubscribers();
    void setStockCount(int stockCount);
    void getStockCount();
}
