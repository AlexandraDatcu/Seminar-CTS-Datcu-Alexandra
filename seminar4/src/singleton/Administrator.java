package singleton;

public class Administrator {
    private String nume;
    private int varsta;

    // eager initialization
    private static Administrator instana = new Administrator("admin",22);
    private Administrator(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public static Administrator getInstance()
    {
        return instana;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
