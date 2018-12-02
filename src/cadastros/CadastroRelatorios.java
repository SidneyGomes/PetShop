package cadastros;

import java.io.Serializable;
import java.util.ArrayList;
import relatorio.Relatorio;

/** Classe que cadastra relatorios produzidos implementa OperacoesCadastrais.
 *
 * @see Relatorio
 * @see OperacoesCadastrais
 * @author Sidney, Adrielly, Mariana
 */
public class CadastroRelatorios implements Serializable, OperacoesCadastrais{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * Array que ira salvar os relatorios
     */
    ArrayList<Relatorio> relatorios = new ArrayList<Relatorio>();
    
    
    
    /**
     * Metodo que cadastra um Objeto do tipo Relatorio
     * 
     * @see Relatorio
     * @param object Objeto do tipo relatorio 
     */
    @Override
    public void cadastrar(Object object){
        relatorios.add((Relatorio)object);
    }
    
    /**
     * Retorna o array que foi salvo os relatorios.
     * 
     * @see ArrayList
     * @return relatorios - Array Definido na classe
     */
    public ArrayList<Relatorio> getRelatorios(){
        return relatorios;
    }
    
    /**
     * Retorna o valor de todos os relatorios cadastrados
     * 
     * @return double - Valo dos relatorios
     */
    public double valorTotalDosRelatorios(){
        double valor = 0.0;
        for(int i  = 0; i < relatorios.size(); i++){
            for(int j = 0; j < relatorios.get(i).getPrestabilidades().size(); j++){
                valor += relatorios.get(i).getPrestabilidades().get(j).getPreco();
            }
        }
        
        return valor;
    }
}
