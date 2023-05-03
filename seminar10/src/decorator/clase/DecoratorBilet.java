package decorator.clase;

public class DecoratorBilet extends Decorator {

    public DecoratorBilet(IBilet biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void printareMesajSustinere() {
        System.out.println("Sustinem " + super.getBiletDecorat().getNumeEchipa1());
    }

}
