public class OtherObserver implements IObserver{
    @Override
    public void onDataReceived(Data data){
        System.out.println("other Data received = "+ data);
    }


}
