package observer.main;

import observer.clase.Banca;
import observer.clase.Client;
import observer.clase.IClient;

public class Main {
    public static void main(String[] args) {
        Banca banca1 = new Banca("ING");
        IClient client1 = new Client("Marcel");
        IClient client2 = new Client("Gigel");
        IClient client3 = new Client("George");
        banca1.actualizeazaAplicatie();
        banca1.adaugaTipCreditNou();
        banca1.adaugaOvserver(client1);
        banca1.adaugaOvserver(client2);
        banca1.adaugaOvserver(client3);
        banca1.stergeObserver(client3);
        banca1.actualizeazaAplicatie();



    }
}