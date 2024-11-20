package MessageSubsriber;

import utils.Observer;

public class MessageSubscriber3 implements Observer {
    @Override
    public void update(Message m) {

        System.out.println("utils.Message subscriber 3 : " + m.getMessage() );
    }
}
