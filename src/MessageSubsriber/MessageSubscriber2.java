public class MessageSubscriber2 implements Observer{
    @Override
    public void update(Message m) {

        System.out.println("Message subscriber 2 : " + m.getMessage() );
    }
}
