package state.main;

import state.clase.Autobuz;
import state.clase.IStare;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("VL21BUN");
        autobuz1.pleacaInService();
        autobuz1.pleacaLaCapatDeLinie();
        autobuz1.pleacaLaCapatDeLinie();
        autobuz1.pleacaInCursa();
        autobuz1.pleacaInService();
        autobuz1.pleacaLaCapatDeLinie();

    }
}
