package builder.model;

public interface Builder {
    public Pacient build();
    public Builder setNumePacient(String nume);
    public Builder setPatRabatabil(boolean patRabatabil);

    public Builder setMicDejunInclus(boolean micDejunInclus);

    public Builder setPapuciCamera(boolean papuciCamera);

    public Builder setHalatInterior(boolean halatInterior);
}
