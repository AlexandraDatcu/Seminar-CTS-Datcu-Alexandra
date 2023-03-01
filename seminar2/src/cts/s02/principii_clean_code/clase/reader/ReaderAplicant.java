package cts.s02.principii_clean_code.clase.reader;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class ReaderAplicant {
    String fileName;
    public ReaderAplicant(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract List<Aplicant> readingAplicanti() throws FileNotFoundException;
}
