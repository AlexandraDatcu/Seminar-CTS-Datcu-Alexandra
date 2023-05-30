package dubluri;

import clase.IPersoana;
import test.ExceptieVarsta;

public class StubPersoana implements IPersoana {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() throws ExceptieVarsta {
        return 21;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
