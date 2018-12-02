package relatorio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import pagamento.CartaoCredito;
import pagamento.Dinheiro;
import pagamento.Pagamento;
import pessoas.*;
import produtos.e.servicos.PrestabilidadePetShop;

/**
 * Classe que cria uma relatorio utilizando para os servicos que seram passados.
 *
 * @see Date
 * @see Pessoas
 * @see PrestabilidadePetShop
 * @author Sidney, Adrielly e Mariana
 */
public class Relatorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Date data;
    private final Clientes cliente;
    private final Funcionarios funcionarios;
    private final ArrayList<PrestabilidadePetShop> prestabilidades;
    private final Pagamento pagamento;

    /**
     * Metodo contrustor que ira passar as variaveis de classe os servicos
     * passados.
     *
     *
     * @param data Data do sistema
     * @param clientes Clientes
     * @param prestabilidade PrestabilidadePetShop
     * @param func Funcionarios
     * @param pagamento Pagamento
     */
    public Relatorio(Date data, Clientes clientes, Funcionarios func, ArrayList<PrestabilidadePetShop> prestabilidade, Pagamento pagamento) {
        this.data = data;
        this.cliente = clientes;
        this.funcionarios = func;
        this.prestabilidades = prestabilidade;
        this.pagamento = pagamento;
    }

    /**
     * Metodo que retorna uma String que ira conter todos os relatorios.
     *
     * @return String - Relatorio compleo
     */
    public String printarRelatorio() {
        String relatorio;

        relatorio = "Data da Compra: " + data.toString()
                + "\n" + "Funcionario: " + this.funcionarios.getNome() + " Codigo: " + this.funcionarios.getCodigo()
                + "\n" + "Cliente: " + cliente.getNome() + " Codigo: " + cliente.getCodigo()
                + "\n" + "Pet: " + cliente.getAnimaiszinho().get(0).getNome() + " Codigo: " + cliente.getAnimaiszinho().get(0).getCodigo() + " Raça: " + cliente.getAnimaiszinho().get(0).getRaca() + " Especie: " + cliente.getAnimaiszinho().get(0).getEspecie()
                + "\n" + "Serviços utilizados: \n";

        for (int i = 0; i < this.prestabilidades.size(); i++) {
            relatorio += "Descrição: " + String.valueOf(prestabilidades.get(i).getDescricao());
            relatorio += " Codigo: " + String.valueOf(prestabilidades.get(i).getCodigo());
            relatorio += " Preço: " + String.valueOf(prestabilidades.get(i).getPreco());
            relatorio += "\n";

        }

        if (pagamento instanceof CartaoCredito) {
            relatorio += "\n" + "Tipo Pagamento: Cartao de Credito" + "\n"
                    + "Valor: " + String.valueOf(pagamento.getValor()) + " Parcelas: " + String.valueOf(((CartaoCredito) pagamento).getParcelas());
        } else {
            relatorio += "\n" + "Tipo Pagamento: Dinheiro" + "\n"
                    + "Valor: " + String.valueOf(pagamento.getValor()) + " Troco: " + String.valueOf(((Dinheiro) pagamento).getTroco());
        }

        relatorio += "\n ___________________________________________________________________________________\n";

        return relatorio;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @return the cliente
     */
    public Clientes getCliente() {
        return cliente;
    }

    /**
     * @return the funcionarios
     */
    public Funcionarios getFuncionarios() {
        return funcionarios;
    }

    /**
     * @return the prestabilidades
     */
    public ArrayList<PrestabilidadePetShop> getPrestabilidades() {
        return prestabilidades;
    }

    /**
     * @return the pagamento
     */
    public Pagamento getPagamento() {
        return pagamento;
    }

}
