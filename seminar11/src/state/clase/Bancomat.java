package state.clase;

public class Bancomat {
    private IStare stare;
    private Integer baniRamasi;

    public Bancomat(Integer baniRamasi) {
        this.baniRamasi = baniRamasi;
        this.stare = new StareNuAreCard();
    }

    protected IStare getStare() {
        return stare;
    }

    protected void setStare(IStare stare) {
        this.stare = stare;
    }
    public void introduceCard(){
        StareAreCard stareAreCard = new StareAreCard();
        stareAreCard.modificaStareBancomat(this);
    }
    public void introducePin()
    {
        StareArePinIntrodus stareArePinIntrodus = new StareArePinIntrodus();
        stareArePinIntrodus.modificaStareBancomat(this);
    }
    public void retrageBani(Integer sumaRetrasa){
        if(this.stare instanceof StareArePinIntrodus){
            if(this.baniRamasi >= sumaRetrasa)
            {
                System.out.println("A fost retrasa suma de " + sumaRetrasa);
                this.baniRamasi -= sumaRetrasa;
                if(this.baniRamasi == 0)
                {
                    IStare stareNuAreBani = new StareNuAreBani();
                    stareNuAreBani.modificaStareBancomat(this);
                }
                else {
                    System.out.println("Nu sunt suficienti bani in cont.");
                }
            }
        }
    }

    public void retrageCard()
    {
        IStare stareNuAreCard = new StareNuAreCard();
        stareNuAreCard.modificaStareBancomat(this);
    }
}
