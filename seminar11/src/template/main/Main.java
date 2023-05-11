package template.main;

import template.clase.Bancomat;
import template.clase.BancomatAbstract;
import template.clase.BancomatBitcoin;

public class Main {
    public static void main(String[] args) {
        BancomatAbstract bancomat =  new Bancomat("Piata Romana");
        bancomat.scoateBaniDeLaBancomat(200);
        BancomatAbstract bancomat2 = new BancomatBitcoin("Univeristate");
        bancomat2.scoateBaniDeLaBancomat(1);
    }
}

