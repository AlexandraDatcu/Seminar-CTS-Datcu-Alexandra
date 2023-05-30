package test;

import categorii.Categorie1;
import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import dubluri.StubPersoana;
import dubluri.StubPersoanaMinora;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StubPersoanaTest {
    @Category(Categorie1.class)
    @Test
    void poateRezervaPachet() {
        IPersoana persoana = new StubPersoana();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Romania",2000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    void nuPoateRezervaPachet() {
        IPersoana persoana = new StubPersoanaMinora();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Bulgaria",1000.0);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    void checkCNP() {
    }
}