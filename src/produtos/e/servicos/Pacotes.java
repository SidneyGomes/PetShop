package produtos.e.servicos;

import java.io.Serializable;
import java.util.ArrayList;

import excecoes.PrestabilidadeNaoEncontradoException;

/**
 * Classe que extende PrestabilidadePetShop e cria um pacote de prestabilidades
 *
 * @see PrestabilidadePetShop
 * @author Sidney, Adrielly e Mariana
 */
public class Pacotes extends PrestabilidadePetShop implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final ArrayList<PrestabilidadePetShop> prestPetShop = new ArrayList<PrestabilidadePetShop>();

    /**
     * Metodo construtor que recebe os valores a serem definidos na superclasse
     *
     * @param codigo Codigo do Pacote
     * @param descricao Descricao do Pacote
     */
    public Pacotes(int codigo, String descricao) {
        super(codigo, descricao, 0);
    }

    /**
     * Metodo que adiciona uma prestabilidade ao Array definido na classe
     *
     *
     * @param prest Objeto do tipo PrestabilidadePetShop
     */
    public void addPrestabilidadePacote(PrestabilidadePetShop prest) {
    	
    	try {
    		procurarPrestabilidades(prest.getCodigo());
    		
    	} catch(PrestabilidadeNaoEncontradoException ex) {
    		
    		this.prestPetShop.add(prest);
            this.setPreco(this.getPreco() + prest.getPreco() - 2.0);
    	}
    }

    public ArrayList<PrestabilidadePetShop> getArray() {
        return prestPetShop;
    }
    
    
    /**Metodo que procura prestabilidades
     * 
     * @param codigo Codigo para pesquisa
     * @return int - Retorna a posicao encntrada do Pacote
     * @throws excecoes.PrestabilidadeNaoEncontradoException , se pacote nao encontrado
     */
    
    public int procurarPrestabilidades(int codigo) throws PrestabilidadeNaoEncontradoException {
        for (int i = 0; i < prestPetShop.size(); i++) {
            if (prestPetShop.get(i).getCodigo() == codigo) {
                return i;
            }
        }

        throw new PrestabilidadeNaoEncontradoException();
    }

}
