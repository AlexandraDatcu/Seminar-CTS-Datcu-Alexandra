package builder.model;

public class BuilderPacient implements Builder {

    private Pacient pacient;

    public BuilderPacient(String nume) {
        this.pacient = new Pacient(nume,false,false,false,false);
    }

    public BuilderPacient setNumePacient(String nume) {
        throw  new IllegalArgumentException("Not aplicabile");
    }
    public BuilderPacient setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public BuilderPacient setMicDejunInclus(boolean micDejunInclus) {
        this.pacient.setMicDejunInclus(micDejunInclus);
        return this;
    }

    public BuilderPacient setPapuciCamera(boolean papuciCamera) {
        this.pacient.setPapuciCamera(papuciCamera);
        return this;
    }

    public BuilderPacient setHalatInterior(boolean halatInterior) {
        this.pacient.setHalatInterior(halatInterior);
        return this;
    }
    @Override
    public Pacient build() {
        return this.pacient;
    }
}
