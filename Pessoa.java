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


}


