public class Observer implements IObserver{
    public void onDataReceived(Data data) {
        System.out.println(" ***  Data received from subject = " + data + "  ***");
    }
}
