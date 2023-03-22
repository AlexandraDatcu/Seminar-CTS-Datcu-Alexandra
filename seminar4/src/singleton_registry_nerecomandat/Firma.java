package singleton_registry_nerecomandat;

public class Firma {
    private String nume;
    private int cifraDeAfaceri;

     protected Firma(String nume, int cifraDeAfaceri) {
        this.nume = nume;
        this.cifraDeAfaceri = cifraDeAfaceri;
    }


    @Override
    public String toString() {
        return "Firma{" +
                "nume='" + nume + '\'' +
                ", cifraDeAfaceri=" + cifraDeAfaceri +
                '}';
    }

    public void incheiereContract(int sumaContract){
         this.cifraDeAfaceri += sumaContract;
    }

}
