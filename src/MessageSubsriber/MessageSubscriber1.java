package MessageSubsriber;

import utils.Observer;

public class MessageSubscriber1 implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("utils.Message subscriber 1 : " + m.getMessage() );
    }
}
