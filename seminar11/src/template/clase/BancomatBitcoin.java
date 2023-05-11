package template.clase;

public class BancomatBitcoin extends BancomatAbstract{
    public BancomatBitcoin(String adresa) {
        super(adresa);
    }

    @Override
    protected void introduceCard() {
        System.out.println("A fost introdus cardul din bancomatul " + this.getAdresa());
    }

    @Override
    protected void introducePin() {
        System.out.println("A fost introdus pinul pentru cardul Bitcoin din " + super.getAdresa());
    }

    @Override
    protected void specificareSuma(int valoareSuma) {
        System.out.println("A fost specificata suma de criptomonede din " + super.getAdresa());
    }

    @Override
    protected void retrageSuma() {
        System.out.println("A fost retrasa suma de criptomode solicitata din " + super.getAdresa());
    }

    @Override
    protected void retrageCard() {
        System.out.println("A fost retras cardul din " + super.getAdresa());
    }
}
