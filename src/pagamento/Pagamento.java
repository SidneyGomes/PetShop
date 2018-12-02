package pagamento;

import java.io.Serializable;

/**
 * Classe que realiza o valor para pagamento das operacoes
 *
 * @author Sidney, Adrielly e Mariana
 */
public class Pagamento implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private double valor;

    /**
     * Metodo construtor para Pagamento
     *
     * @param valor Valor do pagamento
     */
    public Pagamento(double valor) {
        this.valor = valor;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

}
