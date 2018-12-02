package pessoas;

import excecoes.AnimalNaoEncontradoException;
import java.util.ArrayList;
import animais.*;
import java.io.Serializable;


/**
 * Classe que extende Pessoas para o cadastro de clientes e operacoes cadastrais
 * de Pets
 *
 * @see Pessoas
 * @see Pets
 * @author Sidney, Adrielly e Mariana
 */
public class Clientes extends Pessoas implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final ArrayList<Pets> animaizinho;

    /**
     * Metodo construtor que ira criar o Cliente e passar para a classe pai
     * Pessoas
     *
     * @param nome Nome que sera passado para a classe pai Pessoas
     * @param codigo Codigo que sera passado para classe pai Pessoas
     */
    public Clientes(String nome, int codigo) {
        super(nome, codigo);
        this.animaizinho = new ArrayList<Pets>();

    }

    /**
     * Metodo que adiciona animais ao Array de Pets
     *
     * @param pet Objeto do tipo Pet
     */
    public void adicionarAnimais(Pets pet) {
        this.animaizinho.add(pet);
    }

    /**
     * Metodo pra retornar o ArrayList de Pets
     *
     * @return Pets - Retorna ArrayList de Pets
     */
    public ArrayList<Pets> getAnimaiszinho() {
        return this.animaizinho;
    }

    /**
     * Metodo que ira procurar um animal por seu codigo
     *
     *
     * @param codigo Codigo que sera usado pra pesquisa
     * @return int - Indice do Array em que foi encontrado o Pet
     * @throws excecoes.AnimalNaoEncontradoException se Pet nao encontrado
     */
    public int procurarAnimal(int codigo) throws AnimalNaoEncontradoException {
        for (int i = 0; i < animaizinho.size(); i++) {
            if (this.animaizinho.get(i).getCodigo() == codigo) {
                return i;
            }
        }

       throw new AnimalNaoEncontradoException();
    }

    /**
     * Metodo para remover o Pet
     *
     *
     * @param index Indice que ira ser usado pra remover do Array
     */
    public void removerAnimal(int index) {
        animaizinho.remove(index);
    }

    /**
     * Metodo para editar o Pet
     *
     *
     * @param index Indice que ira ser usado pra editar no Array
     * @param nome Nome que ira ser usado pra editar
     * @param codigo Codigo que ira ser usado pra editar
     * @param raca Raca que ira ser usado pra editar
     * @param especie Especie que ira ser usado pra editar
     */
    public void editarAnimal(int index, String nome, int codigo, String raca, String especie) {
        animaizinho.get(index).setCodigo(codigo);
        animaizinho.get(index).setNome(nome);
        animaizinho.get(index).setRaca(raca);
        animaizinho.get(index).setEspecie(especie);
    }

}
