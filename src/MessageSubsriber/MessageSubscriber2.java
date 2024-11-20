package MessageSubsriber;

import utils.Observer;

public class MessageSubscriber2 implements Observer {
    @Override
    public void update(Message m) {

        System.out.println("utils.Message subscriber 2 : " + m.getMessage() );
    }
}
