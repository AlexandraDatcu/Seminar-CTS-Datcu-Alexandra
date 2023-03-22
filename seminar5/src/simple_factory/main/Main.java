package simple_factory.main;

import simple_factory.Factory;
import simple_factory.PersonalSpital;
import simple_factory.TipPersonal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        PersonalSpital brancardier = factory.createObject(TipPersonal.BRANCARDIER,"George");
        PersonalSpital asistent = factory.createObject(TipPersonal.ASISTENT,"Marius");

        List<PersonalSpital> listaPersonal = new ArrayList<>();
        listaPersonal.add(brancardier);
        listaPersonal.add(asistent);
        listaPersonal.add((factory.createObject(TipPersonal.MEDIC, "Andrei")));
        listaPersonal.add((factory.createObject(TipPersonal.MEDIC, "Alex")));
        listaPersonal.add((factory.createObject(TipPersonal.ASISTENT, "Toma")));
        listaPersonal.add((factory.createObject(TipPersonal.BRANCARDIER, "Dan")));
        listaPersonal.add(factory.createObiect(TipPersonal.ANESTEZIST, "Gabi",10));

        for(PersonalSpital personal : listaPersonal){
            personal.descriere();
        }
    }
}