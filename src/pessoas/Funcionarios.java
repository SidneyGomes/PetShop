package pessoas;

import java.io.Serializable;

/**
 * Classe que extende Pessoas para o cadastro de funcionarios
 *
 * @see Pessoas
 * @author Sidney, Adrielly e Mariana
 */
public class Funcionarios extends Pessoas implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Metodo construtor que passa pra classe pai as informacoes
     *
     * @param nome Nome do funcionario
     * @param codigo Codigo do funcionario
     */
    public Funcionarios(String nome, int codigo) {
        super(nome, codigo);

    }
}
