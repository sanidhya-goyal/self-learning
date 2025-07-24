package NotifyMe.src.Observer;

import NotifyMe.src.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update() {
        System.out.println("Sent notification to " + userName + " for the updated stock");
    }
}
