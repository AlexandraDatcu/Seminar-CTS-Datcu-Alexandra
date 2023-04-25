package facade.main;

import facade.clase.AutobuzSimplificat;

public class Main {
    public static void main(String[] args) {
//        Autobuz autobuz = new Autobuz("B1212");
//        autobuz.deschideUsaSpate();
//        autobuz.deschideUsaMijloc();
//        autobuz.ramanedeschideUsaSpate();
        AutobuzSimplificat autobuzSimplificat = new AutobuzSimplificat("B1212");
        autobuzSimplificat.ramaneLiber();
        autobuzSimplificat.deschideUsi();

    }
}
