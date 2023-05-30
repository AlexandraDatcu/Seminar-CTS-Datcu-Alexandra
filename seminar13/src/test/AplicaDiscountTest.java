package test;

import categorii.Categorie1;
import categorii.Categorie2;
import clase.PachetTuristic;
import dubluri.FakePersoana;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplicaDiscountTest {

    @Category(Categorie1.class)
    @Test
    void poatePrimiDiscount(){
    FakePersoana persoana = new FakePersoana();
    persoana.setGetVarstaValue(66);
    PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Bulgaria",1000.0);
    pachetTuristic.aplicaDiscountVarstnici(20);
    assertEquals(800,pachetTuristic.getPret());
    }

    @Category(Categorie2.class)
    @Test
    void nuPoatePrimiDiscount(){
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarstaValue(20);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Bulgaria",1000.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(1000.0,pachetTuristic.getPret());
    }
}