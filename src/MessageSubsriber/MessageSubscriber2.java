package MessageSubsriber;

import utils.Observer;
import utils.Message;

public class MessageSubscriber2 implements Observer {
    @Override
    public void update(Message m) {

        System.out.println("utils.Message subscriber 2 : " + m.getMessage() );
    }
}
