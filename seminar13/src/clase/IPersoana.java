package clase;

import test.ExceptieVarsta;

public interface IPersoana {
    public String getSex();

    public int getVarsta() throws ExceptieVarsta;

    public boolean checkCNP();
}
