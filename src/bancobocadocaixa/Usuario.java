/****************************************************
 * @author Miguel Henrique dos Santos Correa        *
 * RGM: 11231101499                                 *
 * Turma: B                                         *
 * Período: 04                                      *
 ***************************************************/
package bancobocadocaixa;

public class Usuario {

    private String nome;
    private long cpf;
    private int numConta;
    private double valEmConta;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public double getValEmConta() {
        return valEmConta;
    }
    public void setValEmConta(double valEmConta) {
        this.valEmConta = valEmConta;
    }
}
