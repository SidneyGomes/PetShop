package excecoes;

/**
 * Classe excecao que verifica se o Funcionario nao foi encontrado, extende
 * Exception.
 *
 * @see Exception
 * @author Sidney, Adrielly e Mariana
 */
public class FuncionarioNaoEncontradoException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Metodo construtor que envia a mensagem de exececao para o a super classe
     *
     */
    public FuncionarioNaoEncontradoException() {
        super("Funcionario nao encontrado");
    }
}
