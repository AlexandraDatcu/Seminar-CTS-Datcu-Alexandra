package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Element{
    private List<Element> elemente;
    private String denumireGrup;

    public Grup(String denumireGrup) {
        this.elemente = new ArrayList<>();
        this.denumireGrup = denumireGrup;
    }

    @Override
    public float calculareSumaAsigurare() {
        float suma = 0;
        for (Element element : this.elemente) {
            suma += element.calculareSumaAsigurare();
        }
        return suma;
    }

    @Override
    public void adaugaElement(Element element) {
        this.elemente.add(element);
    }

    @Override
    public void stergeElement(Element element) {
        this.elemente.remove(element);
    }

    @Override
    public Element getElement(int index) {
        return this.elemente.get(index);
    }

    @Override
    public void afisareSumaAsigurare() {
        System.out.println("Asigurarea este de: " + this.calculareSumaAsigurare() + " pentru " + this.denumireGrup);
    }
}
