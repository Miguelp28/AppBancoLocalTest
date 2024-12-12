/****************************************************
 * @author Miguel Henrique dos Santos Correa        *
 * RGM: 11231101499                                 *
 * Turma: B                                         *
 * Período: 04                                      *
 ***************************************************/
package bancobocadocaixa;

import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public class ControleUsuario {
    Usuario user = new Usuario();
    //Variaveis para conectar ao banco
    Statement comando;
    PreparedStatement sql;
    ResultSet rs;
    Connection conexao;
    public ControleUsuario(){
        conexao();
    }
    //conexao com o banco
    public void conexao(){
    String nomeBanco = "bancobocacaixa"; // tabela usuarios
    String usuario = "root";
    String senha = "";
    String servidor = "localhost:3307"; // professor não esqueça de mudar a porta caso não esteja funcionando eu estava usando a 3307
    String nomeDriver = "com.mysql.cj.jdbc.Driver";
    try {
        Class.forName(nomeDriver);
        String url = "jdbc:mysql://" + servidor + "/" + nomeBanco + "?useTimezone=true&serverTimezone=UTC";
        conexao = DriverManager.getConnection(url, usuario, senha);
        comando = conexao.createStatement();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            mensagemErroBanco();
            e.printStackTrace();
        }
    }
    //metodos
    public void cadastrar(long isCpf, String isNome, int isNumConta, double isValEmConta){
        user.setCpf(isCpf);
        user.setNome(isNome);
        user.setNumConta(isNumConta);
        user.setValEmConta(isValEmConta);
        try {
            sql = conexao.prepareStatement("INSERT INTO usuarios (cpf, nome, numConta, valEmConta) VALUES (?,?,?,?)");
            sql.setLong(1, user.getCpf());
            sql.setString(2, user.getNome());
            sql.setInt(3, user.getNumConta());
            sql.setDouble(4, user.getValEmConta());
            int verificar = sql.executeUpdate();
            if(verificar > 0){
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário");
            }
        } catch (java.sql.SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Usuário ou numero de conta existente!!");
            System.out.println(e);
        } catch (Exception e) {
            mensagemErroBanco();
        }
    }
    public String consultar(long isCpf){
        String dados = "";
        try{
            sql = conexao.prepareStatement("SELECT * FROM usuarios WHERE cpf=?");
            sql.setLong(1, isCpf);
            rs = sql.executeQuery();
            if(rs.next()){
                dados += rs.getString("nome");
                dados += ";";
                dados += rs.getInt("numConta");
                dados += ";";
                dados += rs.getDouble("valEmConta");
            }else{
                usuarioNaoEncontrado();
            }
        }catch(Exception e){
            mensagemErroBanco();
        }
        return dados;   
    }
    public void listar(){
        try {
            sql=conexao.prepareStatement("SELECT * FROM usuarios");
            rs=sql.executeQuery();
            while(rs.next()){
                System.out.println(
                        "--------------------------------------------------------------------------"+
                        "\nCPF: "+rs.getString("cpf")
                        +"\nNome: "+rs.getString("nome")
                        +"\nNumero Conta: "+rs.getString("numConta")
                        +"\nValor em Conta: R$"+rs.getString("valEmConta")
                        +"\n-----------------------------------------------------------------------");
            }
        } catch (Exception e) {
            mensagemErroBanco();
            System.out.println(e);
        }
    }
    public void depositar(long isCpf, double valDeposito) {
        try {
            sql = conexao.prepareStatement("SELECT valEmConta FROM usuarios WHERE cpf=?");
            sql.setLong(1, isCpf);
            rs = sql.executeQuery();
            if (rs.next()) {
                double valEmConta = rs.getDouble("valEmConta");
                double novoValEmConta = valEmConta + valDeposito;
                sql = conexao.prepareStatement("UPDATE usuarios SET valEmConta=? WHERE cpf=?");
                sql.setDouble(1, novoValEmConta);
                sql.setLong(2, isCpf);
                int verificar = sql.executeUpdate();
                if (verificar > 0) {
                    JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao realizar o depósito");
                }
            } else {
                usuarioNaoEncontrado();
            }
        } catch (Exception e) {
            mensagemErroBanco();
        }
    }
    public void sacar(long isCpf, double valSaque) {
        try {
            sql = conexao.prepareStatement("SELECT valEmConta FROM usuarios WHERE cpf=?");
            sql.setLong(1, isCpf);
            rs = sql.executeQuery();
            if (rs.next()) {
                double valEmConta = rs.getDouble("valEmConta");
                if (valEmConta >= valSaque) {
                    double novoValEmConta = valEmConta - valSaque;
                    sql = conexao.prepareStatement("UPDATE usuarios SET valEmConta=? WHERE cpf=?");
                    sql.setDouble(1, novoValEmConta);
                    sql.setLong(2, isCpf);
                    int verificar = sql.executeUpdate();
                    if (verificar > 0) {
                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao realizar o saque");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente para o saque");
                }
            } else {
                usuarioNaoEncontrado();
            }
        } catch (Exception e) {
            mensagemErroBanco();
        }
    }
    public void excluir(long isCpf){
        try {
            sql = conexao.prepareStatement("DELETE FROM usuarios WHERE cpf=?");
            sql.setLong(1, isCpf);
            int verificar = sql.executeUpdate();
            if(verificar > 0){
                JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso");
            }else{
                usuarioNaoEncontrado();
            }
        } catch (Exception e) {
            mensagemErroBanco();
        }
    }
    public double[] calcEmprestimo(long isCpf, double valEmprestimo, int meses){
        double[] resultados = new double[2];
        double valTotalCmJuros = 0;
        double valParcelas = 0;
        try{            
            sql = conexao.prepareStatement("SELECT * FROM usuarios WHERE cpf=?");
            sql.setLong(1, isCpf);
            rs = sql.executeQuery();
            if(rs.next()){
                double juros = 0.05 * meses;
                double valTotalJuros = valEmprestimo * juros;
                valTotalCmJuros = valEmprestimo + valTotalJuros;
                valParcelas = valTotalCmJuros / meses;
                resultados[0] = valParcelas;
                resultados[1] = valTotalCmJuros;
            }else{
                usuarioNaoEncontrado();
            }
        }catch(Exception e){
            mensagemErroBanco();
        }
        return resultados;
    }
//metodos genericos
    public void mensagemErroBanco(){
        JOptionPane.showMessageDialog(null, "Erro de Acesso ao Banco de Dados!!!");
    }
    public void usuarioNaoEncontrado(){
        JOptionPane.showMessageDialog(null, "Usuário não encontrado");
    }
}
