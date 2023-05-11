package observer.clase;

public interface IBanca {
    public void adaugaOvserver(IClient client);
    public void stergeObserver(IClient client);
    public  void notificaObserver(String mesaj);

}
