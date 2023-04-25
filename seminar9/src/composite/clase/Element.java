package composite.clase;

public interface Element {
    public float calculareSumaAsigurare();
    public void adaugaElement(Element element);
    public void stergeElement(Element element);
    public Element getElement(int index);
    public void afisareSumaAsigurare();
}
