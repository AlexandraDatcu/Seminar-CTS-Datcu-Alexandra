package state.clase;

public class StareLaCapatDeLinie implements IStare{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStareAutobuz() instanceof StareInCursa || autobuz.getStareAutobuz() instanceof  StareLaReparat)
        {
            System.out.println("Autobuzul " + autobuz.getNumarAutobuz() + " a ajuns la capat de linie");
            autobuz.setStareAutobuz(this);
        }
        else{
            System.out.println("Autobuzul " + autobuz.getNumarAutobuz() + " nu poate ajunge la capat de linie");
        }
    }
}
