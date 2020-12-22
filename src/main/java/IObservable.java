public interface IObservable {
    void register(IObserver observer);
    void  unRegister(IObserver observer);
    void update(Data data);
}
