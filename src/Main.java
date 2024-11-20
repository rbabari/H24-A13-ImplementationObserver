// import java.util.utils.Observable; deprecated
// import java.util.utils.Observer;  deprecated

import MessagePublisher.MessagePublisher;
import MessageSubsriber.MessageSubscriber1;
import MessageSubsriber.MessageSubscriber2;
import MessageSubsriber.MessageSubscriber3;
import utils.Message;

public class Main {
    public static void main(String[] args) {
        //

        System.out.println("Hello observateur!");
        // creer des utils.Message observers (Subscribers)
        MessageSubscriber1 m1 = new MessageSubscriber1();
        MessageSubscriber2 m2 = new MessageSubscriber2();
        MessageSubscriber3 m3 = new MessageSubscriber3();

        // creer un observable (Publisher)
        MessagePublisher p1 = new MessagePublisher();

        // attacher observer à observable :: subsbriber attache à publisher
        p1.addObserver(m1);
        p1.addObserver(m2);

        // informer les observers du message ou du changement ...
        p1.notifyObservers(new Message("PREMIER MESSAGE"));

        p1.removeObserver(m2);
        p1.addObserver(m3);
        p1.notifyObservers(new Message("DEUXIEME MESSAGE"));

    }
}