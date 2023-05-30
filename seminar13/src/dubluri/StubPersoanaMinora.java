package dubluri;

import clase.IPersoana;
import test.ExceptieVarsta;

public class StubPersoanaMinora implements IPersoana {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() throws ExceptieVarsta {
        return 14;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
