package prototype.main;

import prototype.model.Prototype;
import prototype.model.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Float> solutii = new HashMap<>();
        solutii.put("sol1",(float) 40);
        solutii.put("sol2",(float) 10);
        solutii.put("sol3",(float) 60.2);
        Reteta reteta1 = new Reteta("reteta1",(float)110.2,solutii);
        Prototype retetaLaborator = reteta1.clonare();
        Prototype retetaPacient = reteta1.clonare();

        System.out.println(reteta1.toString());
        System.out.println(retetaLaborator.toString());
        System.out.println(retetaPacient.toString());
    }
}
