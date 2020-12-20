public class Subject {
    Observer observer;

    public void register(Observer observer){
        this.observer = observer;
    }

    public void  update(){
        observer.onDataReceived(10);
    }

}
