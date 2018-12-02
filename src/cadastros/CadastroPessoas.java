package cadastros;

import excecoes.ClienteNaoEncontradoException;
import excecoes.FuncionarioNaoEncontradoException;
import java.io.Serializable;
import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import pessoas.*;

/**
 * Classe que contem um ArrayList que implementa operacoes cadastrais com
 * classes que herdam de Pessoas.
 *
 * @see Pessoas
 * @author Sidney, Adrielly e Mariana
 */
public class CadastroPessoas implements Serializable, OperacoesCadastrais {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final ArrayList<Pessoas> pessoas = new ArrayList<Pessoas>();

    /**
     * Metodo que retorna um ArrayList de Pessoas definido na classe
     *
     * @return ArrayList - ArrayList de Pessoas
     */
    public ArrayList<Pessoas> getArrayList() {
        return this.pessoas;
    }

    /**
     * Metodo que cadastra uma pessoa, passando seu objeto.
     *
     * @param pessoa Objeto do tipo Pessoa
     */
    @Override
    public void cadastrar(Object pessoa) {
        this.pessoas.add((Pessoas) pessoa);
            
        
    }

    /**
     * Metodo que remove um cliente pelo seu codigo
     *
     *
     * @param codigo Codigo do cliente a ser removido
     * @return null, se cliente encontrado e removido
     * @return ex.getMessage(), se cliente nao encontrado
     */
    public String removerCliente(int codigo) {
        
        int index;
        
        try {
            index = procurarCliente(codigo);
            pessoas.remove(index); 
            return null;
        } catch (ClienteNaoEncontradoException ex) {
            return ex.getMessage();
        }
    }

    /**
     * Metodo que remove um cliente pelo seu codigo
     *
     *
     * @param codigo Codigo do funcionario a ser removido
     * @return null, se funcionario encontrado e removido
     * @return ex.getMessage(), se funcionario nao encontrado
     */
    public String removerFuncionario(int codigo) {
      
        int index;
        
        try {
            index = procurarFuncionario(codigo);
            pessoas.remove(index); 
            return null;
        } catch (FuncionarioNaoEncontradoException ex) {
            return ex.getMessage();
        }
    }

    /**
     * Metodo que procura um funcionario pelo seu codigo
     *
     *
     * @param codigo Codigo do funcionario a ser pesquisado
     * @return int - Retorna a posicao onde foi encontrado o funcionario
     * @throws excecoes.FuncionarioNaoEncontradoException , se funcionerio nao encontrado
     */
    public int procurarFuncionario(int codigo) throws FuncionarioNaoEncontradoException{
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof Funcionarios) {
                if (pessoas.get(i).getCodigo() == codigo) {
                    return i;
                }
            }
        }

        throw new FuncionarioNaoEncontradoException();
    }

    /**
     * Metodo que procura um cliente pelo seu codigo;
     *
     *
     * @param codigo Codigo do funcionario a ser removido
     * @return int - Retorna a posicao onde foi encontrado o cliente
     * @throws excecoes.ClienteNaoEncontradoException , se cliente nao encontrado
     */
    public int procurarCliente(int codigo) throws ClienteNaoEncontradoException {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof Clientes) {
                if (pessoas.get(i).getCodigo() == codigo) {
                    return i;
                }
            }
        }

        throw new ClienteNaoEncontradoException();
    }

    /**
     * Edita um cliente, pelo seu indice encontrado
     *
     * @param index Indice do vetor onde sera editado
     * @param nome Nome do cliente
     * @param codigo Codigo do cliente
     */
    public void editarCliente(int index, String nome, int codigo) {
        this.pessoas.get(index).setCodigo(codigo);
        this.pessoas.get(index).setNome(nome);

    }

    /**
     * Edita um funcionario, pelo seu indice encontrado
     *
     * @param index Indice do vetor onde sera editado
     * @param nome Nome do funcionario
     * @param codigo Codigo do funcionario
     */
    public void editarFuncionario(int index, String nome, int codigo) {
        this.pessoas.get(index).setCodigo(codigo);
        this.pessoas.get(index).setNome(nome);

    }

}
