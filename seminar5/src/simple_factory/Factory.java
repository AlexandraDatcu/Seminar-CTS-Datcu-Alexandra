package simple_factory;

public class Factory {
    public PersonalSpital createObject(TipPersonal tipPersonal, String nume)
    {
        switch (tipPersonal) {
            case MEDIC:
                return new Medic(nume);
            case ASISTENT:
                return new Asistent(nume);
            case BRANCARDIER:
                return new Brancardier(nume);
//            case ANESTEZIST:
//               return new Anestezist(nume, 0);
            default:
                return null;
        }
    }
    public PersonalSpital createObiect(TipPersonal tipPersonal, String nume, int nrPacienti)
    {
        switch (tipPersonal)
        {
            case ANESTEZIST: return new Anestezist(nume,nrPacienti);
            default: return this.createObject(tipPersonal, nume);
        }
    }
}
