package flyweight.main;

import flyweight.clase.FabricaSpectatori;
import flyweight.clase.PozitieDesenare;

public class Main {
    public static void main(String[] args) {
        FabricaSpectatori fabricaSpectatori = new FabricaSpectatori();
        PozitieDesenare pozitieDesenare1 = new PozitieDesenare(20,10,"Rosu");
        PozitieDesenare pozitieDesenare2 = new PozitieDesenare(10,30,"Negru");
        PozitieDesenare pozitieDesenare3 = new PozitieDesenare(24,12,"Mov");
        fabricaSpectatori.getSpectator(1,20,10).deseneazaSpectator(pozitieDesenare1);
        fabricaSpectatori.getSpectator(2, 13.5F,12).deseneazaSpectator(pozitieDesenare2);
        fabricaSpectatori.getSpectator(1,20,23).deseneazaSpectator(pozitieDesenare3);

    }
}
