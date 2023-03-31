package prototype.model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Prototype{
    private Map<String,Float> solutii;
    private String numeReteta;
    private Float gramaj;

    public Reteta(String numeReteta, Float gramaj,Map<String,Float>solutii) {
        this.solutii = solutii;
        this.numeReteta = numeReteta;
        float suma = 0;
        this.gramaj = gramaj;

        for(float val : solutii.values()) {
            suma += val;
        }

        if(this.gramaj > suma - 0.1 && this.gramaj < suma + 0.1)
        {
            this.solutii = solutii;
        }
        else{
            throw new IllegalArgumentException("Gramaj gresit");
        }
        this.gramaj = gramaj;
    }
    private Reteta()
    {
        numeReteta = null;
        gramaj = null;
        solutii = null;
    }

    @Override
    public Prototype clonare() {
        Reteta reteta = new Reteta();
        reteta.numeReteta = this.numeReteta;
        reteta.gramaj = this.gramaj;
        reteta.solutii = new HashMap<>();
        for(String val:this.solutii.keySet())
        {
            reteta.solutii.put(val,this.solutii.get(val));
        }
        return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                ", numeReteta='" + numeReteta + '\'' +
                ", gramaj=" + gramaj +
                '}';
    }
}
