package cts.s02.principii_clean_code.clase.reader;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ReaderAplicant {
    String fileName;
    public ReaderAplicant(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract List<Aplicant> readingAplicanti() throws FileNotFoundException;

    public void citesteAplicant(Scanner input, Aplicant aplicant){
        aplicant.setNume(input.next());
        aplicant.setPrenume(input.next());
        aplicant.setVarsta(input.nextInt());
        aplicant.setPunctaj(input.nextInt());
        aplicant.setNrproiecte(input.nextInt());
        String[] denumiriProiecte = new String[aplicant.getNrproiecte()];
        for (int i = 0; i < aplicant.getNrproiecte(); i++)
            denumiriProiecte[i] = input.next();
        aplicant.setDenumiriProiecte(denumiriProiecte);
    }
}
