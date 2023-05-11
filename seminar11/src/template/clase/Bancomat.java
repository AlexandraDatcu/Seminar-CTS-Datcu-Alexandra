package template.clase;

public class Bancomat extends BancomatAbstract{


    public Bancomat(String adresa) {
        super(adresa);
    }

    @Override
    protected void introduceCard() {
        System.out.println("A fost introdus cardul de la bancomatul din " + super.getAdresa());
    }

    @Override
    protected void introducePin() {
        System.out.println("A fost introdus PIN-ul din bancomatul din " + super.getAdresa());

    }

    @Override
    protected void specificareSuma(int valoareSuma) {
        System.out.println("A fost specificata pentru retragere suma de " + valoareSuma);
    }

    @Override
    protected void retrageSuma() {
        System.out.println("A fost retrasa suma de la bancomatul din " + super.getAdresa());
    }

    @Override
    protected void retrageCard() {
        System.out.println("A fost retras cardul de la bancomatul din " + super.getAdresa());
    }
}
