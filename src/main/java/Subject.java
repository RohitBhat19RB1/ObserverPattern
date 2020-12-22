import java.util.ArrayList;
import java.util.List;

public class Subject implements IObservable {
   List<IObserver> observers = new ArrayList<>();

   @Override
    public void register(IObserver observer){
        observers.add(observer);
    }

    @Override
    public void unRegister(IObserver observer){
        observers.remove(observer);
    }

    @Override
    public void  update(Data data){
        for (IObserver observer : observers) {
            observer.onDataReceived(data);
        }
    }

}
