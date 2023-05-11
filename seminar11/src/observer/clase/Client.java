package observer.clase;

public class Client implements IClient {
    public String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaMesaj(String mesaj) {
        System.out.println(this.nume + " a primit mesaj: " + mesaj);
    }
}
