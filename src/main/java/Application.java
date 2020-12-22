public class Application {

    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer = new Observer();
        subject.register(observer);

        OtherObserver otherObserver = new OtherObserver();
        subject.register(otherObserver);

        NewObserver newObserver = new NewObserver();
        subject.register(newObserver);

        Data data = new Data();
        data.floatData = 2.5f;
        data.intData = 10;
        data.stringData = "Rohit";

        subject.update(data);
        subject.unRegister(newObserver);
        subject.update(data);
    }
}
