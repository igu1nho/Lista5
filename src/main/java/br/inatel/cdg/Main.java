package br.inatel.cdg;

import java.nio.file.Path;
import java.nio.file.Paths;
import br.inatel.cdg.CSVUtils;

public class Main {

    public static void main(String[] args) {

        Path arquivo = Paths.get("funcionario.csv");
        CSVUtils.gerarCSVFuncSemFilhos(arquivo);
    }
}
