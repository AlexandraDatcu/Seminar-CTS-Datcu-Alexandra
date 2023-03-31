package builder.model;

public class BuilderPacient2 implements Builder {

    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;


    public BuilderPacient2() {
        this.nume = "Anonim";
        this.patRabatabil = false;
        this.halatInterior = false;
        this.papuciCamera = false;
        this.micDejunInclus = false;
    }

    @Override
    public Pacient build() {
        return new Pacient(this.nume,this.patRabatabil,this.micDejunInclus,this.papuciCamera,this.halatInterior);
    }

    @Override
    public BuilderPacient2 setNumePacient(String nume) {
        this.nume = nume;
        return this;
    }
    public BuilderPacient2 setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public BuilderPacient2 setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    public BuilderPacient2 setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    public BuilderPacient2 setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }
}
