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
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = sc.nextLine();

        System.out.println("Digite seu cpf: ");
        this.cpf = sc.nextLine();

        System.out.println("Digite seu idade: ");
        this.idade = sc.nextInt();

        System.out.println("Digite sua data de nascimento: ");
        sc.nextLine();
        this.data_nasc = sc.nextLine();

    }




    public String toString (){
        return   '\'' +
                "Nome='" + nome + '\'' +
                ", CPF=" + cpf +
                ", Idade='" + idade + '\'' +
                "Data de Nascimento= " + data_nasc + '\'';
    }

}


