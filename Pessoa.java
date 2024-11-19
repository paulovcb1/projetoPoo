import javax.swing.*;
import java.util.Scanner;

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

    void exibirInfo () {
        System.out.println("Nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("idade: " + idade);
        System.out.println("data de nascimento: " + data_nasc);

    }

    public Pessoa () {}

    public void catchInfo () {

        this.nome = JOptionPane.showInputDialog(null, "insira sua Nome");

        this.cpf = JOptionPane.showInputDialog(null, "insira sua cpf");

        this.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "insira sua idade"));

        this.data_nasc = JOptionPane.showInputDialog(null, "insira sua data de nascimento");

    }




    public String toString (){
        return   '\'' +
                "Nome: " + nome + '\'' + "\n" +
                "CPF: " + cpf + "\n" +
                "Idade: '" + idade + '\'' + "\n" +
                "Data de Nascimento: " + data_nasc + '\'';

    }

}


