package state.clase;

public class StareNuAreBani implements IStare{
    @Override
    public void modificaStareBancomat(Bancomat bancomat) {
        if(bancomat.getStare() instanceof StareArePinIntrodus)
        {
            bancomat.setStare(this);
            System.out.println("Bancomataul nu are bani");
        }
    }
}
