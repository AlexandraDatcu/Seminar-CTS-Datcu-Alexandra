package decorator.clase;

public abstract class Decorator implements IBilet {
    private IBilet biletDecorat;

    public Decorator(IBilet biletDecorat) {
        this.biletDecorat = biletDecorat;
    }

    public IBilet getBiletDecorat() {
        return biletDecorat;
    }

    @Override
    public String getNumeEchipa1() {
        return biletDecorat.getNumeEchipa1();
    }

    @Override
    public void printareBilet() {
        this.biletDecorat.printareBilet();
        printareMesajSustinere();
    }
    public abstract void printareMesajSustinere();
}
