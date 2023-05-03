package strategy.main;

import strategy.clase.Jandarm;
import strategy.clase.Spectator;
import strategy.clase.VerificarePeluza;
import strategy.clase.VerificareVip;

public class Main {
    public static void main(String[] args) {
        Jandarm jandarm = new Jandarm("Ion");
        Spectator spectator1 = new Spectator("Gigel");
        Spectator spectator2 = new Spectator("Vasile");
        Spectator spectator3 = new Spectator("George");
        Spectator spectator4 = new Spectator("Costel");
        jandarm.setModVerificare(new VerificareVip());
        jandarm.verificaSpectator(spectator1);
        jandarm.setModVerificare( new VerificarePeluza());
        jandarm.verificaSpectator(spectator3);


    }
}
