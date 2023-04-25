package composite.main;

import composite.clase.Autobuz;
import composite.clase.Element;
import composite.clase.Grup;

public class Main {
    public static void main(String[] args) {
        Element autobuz1 = new Autobuz("Mercedes",3000,7);
        Element autobuz2 = new Autobuz("Mercedes", 4000,9);
        Element grupAutobuzeMici = new Grup("Grup autobuze mici");
        grupAutobuzeMici.adaugaElement(autobuz1);
        grupAutobuzeMici.adaugaElement(autobuz2);
        grupAutobuzeMici.afisareSumaAsigurare();

        Element autobuz3 = new Autobuz("Mercedes",9000,7);
        Element autobuz4 = new Autobuz("Mercedes", 10000,9);
        Element grupAutobuzeMedii= new Grup("Grup autobuze medii");
        grupAutobuzeMedii.adaugaElement(autobuz3);
        grupAutobuzeMedii.adaugaElement(autobuz4);
        grupAutobuzeMedii.afisareSumaAsigurare();

        Element grupAutobuze = new Grup("Autobuze");
        grupAutobuze.adaugaElement(grupAutobuzeMici);
        grupAutobuze.adaugaElement(grupAutobuzeMedii);
        grupAutobuze.afisareSumaAsigurare();

        Element autobuzVip = new Autobuz("Ford",10500,20);
        grupAutobuze.adaugaElement(autobuzVip);
        grupAutobuze.afisareSumaAsigurare();

    }
}
