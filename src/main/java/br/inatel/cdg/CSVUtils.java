package br.inatel.cdg;

import com.opencsv.CSVWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {

    public static void main(String[] args) throws IOException {

        String[] cabecalho = {"Identificador","Est.civil","Inst","Filhos","Salario"};

        List<String[]> linhas = new ArrayList<>();
        linhas.add(new String[]{"1","solteiro","1o Grau","0","4"});
        linhas.add(new String[]{"2","casado","1o Grau","1","4.56"});
        linhas.add(new String[]{"3","casado","1o Grau","2","5.25"});
        linhas.add(new String[]{"4","solteiro","2o Grau","0","5.73"});
        linhas.add(new String[]{"5","solteiro","1o Grau","0","6.26"});
        linhas.add(new String[]{"6","casado","1o Grau","0","6.66"});
        linhas.add(new String[]{"7","solteiro","1o Grau","0","6.86"});
        linhas.add(new String[]{"8","solteiro","1o Grau","0","7.39"});
        linhas.add(new String[]{"9","casado","2o Grau","1","7.59"});
        linhas.add(new String[]{"10","solteiro","2o Grau","0","7.44"});
        linhas.add(new String[]{"11","casado","2o Grau","2","8.12"});
        linhas.add(new String[]{"12","solteiro","1o Grau","0","8.46"});
        linhas.add(new String[]{"13","solteiro","2o Grau","0","8.74"});
        linhas.add(new String[]{"14","casado","1o Grau","3","8.95"});
        linhas.add(new String[]{"15","casado","2o Grau","0","9.13"});
        linhas.add(new String[]{"16","solteiro","2o Grau","0","9.35"});
        linhas.add(new String[]{"17","casado","2o Grau","1","9.77"});
        linhas.add(new String[]{"18","casado","1o Grau","2","9.8"});
        linhas.add(new String[]{"19","solteiro","Superior","0","10.53"});
        linhas.add(new String[]{"20","solteiro","2o Grau","0","10.76"});
        linhas.add(new String[]{"21","casado","2o Grau","1","11.06"});
        linhas.add(new String[]{"22","solteiro","2o Grau","0","11.59"});
        linhas.add(new String[]{"23","solteiro","1o Grau","0","12"});
        linhas.add(new String[]{"24","casado","Superior","0","12.79"});
        linhas.add(new String[]{"25","casado","2o Grau","2","13.23"});
        linhas.add(new String[]{"26","casado","2o Grau","2","13.6"});
        linhas.add(new String[]{"27","solteiro","1o Grau","0","13.85"});
        linhas.add(new String[]{"28","casado","2o Grau","0","14.69"});
        linhas.add(new String[]{"29","casado","2o Grau","5","14.71"});
        linhas.add(new String[]{"30","casado","2o Grau","2","15.99"});
        linhas.add(new String[]{"31","solteiro","Superior","0","16.22"});
        linhas.add(new String[]{"32","casado","2o Grau","1","16.61"});
        linhas.add(new String[]{"33","casado","Superior","3","17.26"});
        linhas.add(new String[]{"34","solteiro","Superior","0","18.75"});
        linhas.add(new String[]{"35","casado","2o Grau","2","19.4"});
        linhas.add(new String[]{"36","casado","Superior","3","23.3"});

        Writer writer = Files.newBufferedWriter(Paths.get("funcionarios.csv"));
        CSVWriter csvWriter = new CSVWriter(writer);

        csvWriter.writeNext(cabecalho);
        csvWriter.writeAll(linhas);

        csvWriter.flush();
        writer.close();

    }
}
