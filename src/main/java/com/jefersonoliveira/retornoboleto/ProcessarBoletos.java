package com.jefersonoliveira.retornoboleto;

/**
 * Processa arquivos de retorno de boletos bancários utilizando a implementação de
 * alguma estratégia ({@link LeituraRetorno}).
 * Esta é uma classe que chamamos de Estrategista,
 * por poder utilizar diferentes estratégias de acordo com as necessidades,
 * podendo mudar a estratégia a ser utilizada até em tempo de execução.
 *
 * @author Manoel Campos da Silva Filho
 */
public class ProcessarBoletos {

    private LeituraRetorno leituraRetorno;

    //Porque eu preciso de um this no método a baixo?
    //Porque o this é uma referência para o objeto atual.
    //onde ela será chamada? No construtor.
    public ProcessarBoletos(LeituraRetorno leituraRetorno) {
        // implementação
        this.leituraRetorno = leituraRetorno;
    }

    public final void processar(String caminhoArquivo) {
        // implementação
        System.out.println("Boletos");
        System.out.println("----------------------------------------------------------------------------------");
        var lista = leituraRetorno.lerArquivo(caminhoArquivo);
        for (Boleto boleto : lista) {
            System.out.println(boleto);
        }

    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
