package singleton;

public class Soare {
    private String culoare;
    private float diametru;
    //lazy initialization
    private static Soare instanta = null;

    private Soare(String culoare, float diametru) {
        this.culoare = culoare;
        this.diametru = diametru;
    }
    public static synchronized Soare getInstance(String culoare, float diametru)
    {
        if(instanta == null)
        {
            instanta = new Soare(culoare,diametru);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "Soare{" +
                "culoare='" + culoare + '\'' +
                ", diametru=" + diametru +
                '}';
    }
}
