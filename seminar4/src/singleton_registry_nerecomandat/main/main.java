package singleton_registry_nerecomandat.main;

import singleton_registry_nerecomandat.Firma;
import singleton_registry_nerecomandat.Registru;

public class main {
    public static void main(String[] args) {
        Firma firma1 = Registru.getFirma("Gigel SRL");
        Firma firma2 = Registru.getFirma("Gigel SRL");
        Firma firma3 = Registru.getFirma("Costel SRL");
        firma1.incheiereContract(100);
        firma2.incheiereContract(200);
        firma3.incheiereContract(300);
        System.out.printf(firma1.toString());
        System.out.printf(firma2.toString());
        System.out.printf(firma3.toString());


    }
}
