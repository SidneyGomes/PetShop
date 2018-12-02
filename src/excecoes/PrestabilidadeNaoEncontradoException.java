package excecoes;

/**
 * Classe excecao que verifica se a prestabilidade nao foi encontrada, extende
 * Exception.
 *
 * @see Exception
 * @author Sidney, Adrielly e Mariana
 */
public class PrestabilidadeNaoEncontradoException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Metodo construtor que envia a mensagem de exececao para o a super classe
     *
     */
    public PrestabilidadeNaoEncontradoException() {
        super("Prestabilidade nao encontrado");
    }
}
