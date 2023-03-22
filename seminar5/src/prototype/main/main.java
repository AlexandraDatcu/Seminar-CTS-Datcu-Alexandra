package prototype.main;

import prototype.Autobuz;
import prototype.MijlocTransport;

public class main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz("PH12QWE",10);
        MijlocTransport autobuz1 = new Autobuz("B12DWE",20);
        Autobuz autobuz2 = (Autobuz) autobuz1.clone();
        MijlocTransport autobuz3 = (Autobuz) autobuz.clone();
        autobuz2.setNrInmatriculare("CT12QWE");
        System.out.println(autobuz2.toString());
        System.out.println(autobuz1.toString());
        System.out.println(autobuz.toString());
        System.out.println(autobuz3.toString());
    }
}
