package state.clase;

public class StareLaReparat implements IStare{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStareAutobuz() instanceof StareLaCapatDeLinie){
            System.out.println("Autobuzul " + autobuz.getNumarAutobuz() + " a ajuns in service");
            autobuz.setStareAutobuz(this);
        }
        else{
            System.out.println("Autobuzul " + autobuz.getNumarAutobuz() + " nu poate ajunge in service");
        }
    }
}
