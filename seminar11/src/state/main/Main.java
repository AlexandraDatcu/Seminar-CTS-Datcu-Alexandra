package state.main;

import state.clase.Bancomat;

public class Main {
    public static void main(String[] args) {
        Bancomat bancomat1 = new Bancomat(1000);
        bancomat1.introducePin();
        bancomat1.retrageCard();
        bancomat1.introducePin();
        bancomat1.retrageBani(200);
        bancomat1.introduceCard();
        bancomat1.introducePin();
        bancomat1.retrageBani(500);
        bancomat1.introducePin();
        bancomat1.retrageBani(1000);
        bancomat1.retrageCard();

    }
}
