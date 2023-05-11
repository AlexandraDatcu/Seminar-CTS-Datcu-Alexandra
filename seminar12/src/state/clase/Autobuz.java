package state.clase;

public class Autobuz {
    private IStare stareAutobuz;
    private String numarAutobuz;

    public Autobuz(String numarAutobuz) {
        this.numarAutobuz = numarAutobuz;
        this.stareAutobuz = new StareLaCapatDeLinie();
    }

    public IStare getStareAutobuz() {
        return stareAutobuz;
    }

    protected void setStareAutobuz(IStare stareAutobuz) {
        this.stareAutobuz = stareAutobuz;
    }

    public String getNumarAutobuz() {
        return numarAutobuz;
    }
    public void pleacaInCursa()
    {
        IStare stareInCursa = new StareInCursa();
        stareInCursa.modificaStare(this);
    }
    public void pleacaInService()
    {
        IStare stareInService= new StareLaReparat();
        stareInService.modificaStare(this);
    }
    public void pleacaLaCapatDeLinie()
    {
        IStare stareLaCapatDeLinie = new StareLaCapatDeLinie();
        stareLaCapatDeLinie.modificaStare(this);
    }
}
