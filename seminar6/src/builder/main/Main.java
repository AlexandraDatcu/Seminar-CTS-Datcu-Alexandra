package builder.main;

import builder.model.Builder;
import builder.model.BuilderPacient;
import builder.model.BuilderPacient2;
import builder.model.Pacient;

public class Main {
    public static void main(String[] args) {
        Builder builderPacient = new BuilderPacient("Mihai");
        Pacient pacient1;
        Pacient pacient2;
        pacient1 = builderPacient.setPapuciCamera(true).setMicDejunInclus(true).build();
        pacient2 = builderPacient.setPatRabatabil(true).build();
        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());


        Builder builderPacient2 = new BuilderPacient2();
        Pacient pacient3 = builderPacient2.setNumePacient("Gigel").setHalatInterior(true).build();
        Pacient pacient4 = builderPacient2.setNumePacient("Costel").build();
        System.out.println(pacient3.toString());
        System.out.println(pacient4.toString());

    }
}