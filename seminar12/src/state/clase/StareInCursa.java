package state.clase;

public class StareInCursa implements IStare{

    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStareAutobuz() instanceof StareLaCapatDeLinie)
        {
            System.out.println("Autobuzul " + autobuz.getNumarAutobuz() + " pleaca intr-o cursa noua");
            autobuz.setStareAutobuz(this);
        }
        else{
            System.out.println("Autobuzul " + autobuz.getNumarAutobuz() +  "nu poate pleca intr-o cursa noua");
        }
    }
}
