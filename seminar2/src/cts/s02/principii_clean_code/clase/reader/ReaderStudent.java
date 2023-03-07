package cts.s02.principii_clean_code.clase.reader;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderStudent extends ReaderAplicant{

    public ReaderStudent(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readingAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.getFileName()));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student student = new Student();
            citesteAplicant(input,student);
            student.setAn_studii(input.nextInt());
            student.setFacultate((input.next()).toString());
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
