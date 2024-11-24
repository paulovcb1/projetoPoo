import javax.swing.*;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private String data_nasc;

    public Pessoa(String data_nasc, int idade, String cpf, String nome) {
        this.data_nasc = data_nasc;
        this.idade = idade;
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    void exibirInfo () {
        System.out.println("Nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("idade: " + idade);
        System.out.println("data de nascimento: " + data_nasc);

    }

    public Pessoa () {}

    public void catchInfo () {

        this.nome = JOptionPane.showInputDialog(null, "Insira seu Nome");

        this.cpf = JOptionPane.showInputDialog(null, "Insira seu cpf");

        this.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade"));

        this.data_nasc = JOptionPane.showInputDialog(null, "Insira sua data de nascimento");

    }

    public String toString (){
        return   '\'' +
                "Nome: " + nome + '\'' + "\n" +
                "CPF: " + cpf + "\n" +
                "Idade: '" + idade + '\'' + "\n" +
                "Data de Nascimento: " + data_nasc + '\'';

    }
}
