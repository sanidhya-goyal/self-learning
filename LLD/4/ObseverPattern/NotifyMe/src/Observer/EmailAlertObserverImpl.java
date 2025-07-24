package NotifyMe.src.Observer;

import NotifyMe.src.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        System.out.println("Sent Email to " + emailId + " for the updated stock");
    }
}
