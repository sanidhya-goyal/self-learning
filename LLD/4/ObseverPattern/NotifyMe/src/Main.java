package NotifyMe.src;

import NotifyMe.src.Observable.IphoneStockObservable;
import NotifyMe.src.Observable.StocksObservable;
import NotifyMe.src.Observer.EmailAlertObserverImpl;
import NotifyMe.src.Observer.MobileAlertObserverImpl;
import NotifyMe.src.Observer.NotificationAlertObserver;

public class Main {
    public static void main (String [] args) {
        StocksObservable iphoneobservable = new IphoneStockObservable();
        // this is done in order to specify which observable changes should be notified to which observer
        NotificationAlertObserver subscriber1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneobservable);
        NotificationAlertObserver subscriber2 = new MobileAlertObserverImpl("xyz_user", iphoneobservable);
        iphoneobservable.add(subscriber1);
        iphoneobservable.add(subscriber2);

        iphoneobservable.setStockCount(10);

    }
}
