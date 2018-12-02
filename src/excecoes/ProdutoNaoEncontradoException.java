package excecoes;

/**
 * Classe excecao que verifica se o produto nao foi encontrado, extende
 * Exception.
 *
 * @see Exception
 * @author Sidney, Adrielly e Mariana
 */
public class ProdutoNaoEncontradoException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Metodo construtor que envia a mensagem de exececao para o a super classe
     *
     */
    public ProdutoNaoEncontradoException() {
        super("Produto nao encontrado");
    }
}
