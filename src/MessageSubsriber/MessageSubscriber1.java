public class MessageSubscriber1 implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("Message subscriber 1 : " + m.getMessage() );
    }
}
