public class MessageSubscriber3 implements Observer{
    @Override
    public void update(Message m) {

        System.out.println("Message subscriber 3 : " + m.getMessage() );
    }
}
