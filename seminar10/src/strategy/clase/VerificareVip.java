package strategy.clase;

public class VerificareVip implements Strategy{
    @Override
    public void modVerificareSpectator(Spectator spectator) {
        System.out.println(spectator.getNume() + " este verificat pentru intrarea la VIP");
    }
}
