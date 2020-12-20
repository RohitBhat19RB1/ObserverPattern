public class Application {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new Observer();
        subject.register(observer);
        subject.update();
    }
}
