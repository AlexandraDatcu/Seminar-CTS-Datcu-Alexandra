package facade.clase;

public class Autobuz {
    private String numarInmatriculare;

    public Autobuz(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }
    public void deschideUsaFata(){
        System.out.println("usa din fata a fost deschisa pentru autobuzul cu numarul " + this.numarInmatriculare);
    }
    public void deschideUsaMijloc(){
        System.out.println("usa din mijloc a fost deschisa pentru autobuzul cu numarul " + this.numarInmatriculare);
    }
    public void deschideUsaSpate(){
        System.out.println("usa din spate a fost deschisa pentru autobuzul cu numarul " + this.numarInmatriculare);
    }
    public void ramanedeschideUsaFata(){
        System.out.println("Usa din fata poate fi deschisa pentru calatori pentru autobuzul cu numarul " + this.numarInmatriculare);
    }
    public void ramanedeschideUsaMijloc(){
        System.out.println("Usa din mijloc poate fi deschisa pentru calatori pentru autobuzul cu numarul " + this.numarInmatriculare);
    }
    public void ramanedeschideUsaSpate(){
        System.out.println("Usa din spate poate fi deschisa pentru calatori pentru autobuzul cu numarul " + this.numarInmatriculare);
    }

}
