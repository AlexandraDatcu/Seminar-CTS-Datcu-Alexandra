package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IBanca{
    public List<IClient> observeri;
    public String numeBanca;

    public Banca(String numeBanca) {
        this.numeBanca = numeBanca;
        this.observeri = new ArrayList<>();
    }

    @Override
    public void adaugaOvserver(IClient client) {
        this.observeri.add(client);
    }

    @Override
    public void stergeObserver(IClient client) {
        this.observeri.remove(client);
    }

    @Override
    public void notificaObserver(String mesaj) {
        for (IClient client: this.observeri) {
            client.afiseazaMesaj(mesaj);
        }
    }
    public void adaugaTipCreditNou(){
        this.notificaObserver(this.numeBanca + ": Am adaugat un nou tip de credit");
    }

    public void actualizeazaAplicatie(){
        this.notificaObserver(this.numeBanca + ": Aplicatia a fost actualizata");
    }
}
