package flyweight.clase;

import java.util.HashMap;

public class FabricaSpectatori{
    private HashMap<Integer, ISpectator> spectatori;

    public FabricaSpectatori() {
        super();
        this.spectatori = new HashMap<>();
    }

    public ISpectator getSpectator(int id,float latimeUmeri, float inaltime)
    {
        if(this.spectatori.containsKey(id))
        {
            return this.spectatori.get(id);
        }
        else{
            ISpectator spectator = new Spectator(inaltime, latimeUmeri, id);
            this.spectatori.put(id,spectator);
            return spectator;
        }
    }
}
