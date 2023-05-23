package test;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class PersoanaTest {

    @org.junit.jupiter.api.Test
    void testgetVarstaRight() {
        IPersoana persoana = new Persoana("Gigel","5010512415523");
        Assert.assertEquals(22, persoana.getVarsta());
    }
    @org.junit.jupiter.api.Test
    void testGetVarstaBoundary()
    {
        IPersoana persoana = new Persoana("Gigel","5230523415523");
        Assert.assertEquals(0, persoana.getVarsta());
    }
    @org.junit.jupiter.api.Test
    void testgetVarstaBoundaryAn2000()
    {
        IPersoana persoana = new Persoana("Gigel","6000512415523");
        Assert.assertEquals(23, persoana.getVarsta());
    }
    @org.junit.jupiter.api.Test
    void testgetVarstaBoundaryAn1999()
    {
        IPersoana persoana = new Persoana("Gigel", "1991231551177");
        Assert.assertEquals(23, persoana.getVarsta());
    }
    @Test
    void testGetVarstaError()
    {
        IPersoana persoana = new Persoana("Gigel","6230725415523");
        Assert.assertThrows(ExceptieVarsta.class,()->persoana.getVarsta());
    }
    @Test
    void testGetVarstaPerformance()
    {
        IPersoana persoana = new Persoana("Gigel","5010512415523");
        Assertions.assertTimeout(Duration.ofMillis(100), ()->persoana.getVarsta());
    }
    @Test
    void testConstructorPersoanaConformance()
    {
        Persoana persoana = new Persoana("Gigel","6230725415523");
        Assert.assertEquals(13,persoana.CNP.length());
    }
    @Test
    void testGetVarstaOrder()
    {
        IPersoana persoana1 = new Persoana("Gigel","5220523415523");
        IPersoana persoana2 = new Persoana("Gigel","5230223415253");
        Assert.assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
    }


    @Test
    void testGetVarstaNoCnp(){
        IPersoana persoana1 = new Persoana("Gigel",null);
        Assert.assertThrows(ExceptionCnpInexistent.class,()->persoana1.getVarsta());
    }
    @Test
    void testGetVarstaCardinality()
    {
        IPersoana persoana1 = new Persoana("Gigel","6220523455676");
        Assert.assertEquals(1, persoana1.getVarsta());

    }


}