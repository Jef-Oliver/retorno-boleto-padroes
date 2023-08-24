import com.jefersonoliveira.retornoboleto.LeituraRetornoBancoBrasil;
import com.jefersonoliveira.retornoboleto.LeituraRetornoBradesco;
import com.jefersonoliveira.retornoboleto.ProcessarBoletos;

import java.net.URISyntaxException;

/**
 * Classe para ver o funcionamento da leitura de boletos.
 *
 * @author Manoel Campos da Silva Filho
 */
public class Principal {
    public static void main(String[] args) throws URISyntaxException {
        var leituraRetorno = new LeituraRetornoBancoBrasil();
        var processador = new ProcessarBoletos(leituraRetorno);

        processador.setLeituraRetorno(leituraRetorno);
        processador.processar("banco-brasil-1.csv");

        //Leitura Bradesco
        var leituraBradesco = new LeituraRetornoBradesco();
        processador.setLeituraRetorno(leituraBradesco);
        processador.processar("bradesco-1.csv");

    }
}
