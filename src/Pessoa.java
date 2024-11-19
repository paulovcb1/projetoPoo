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

    protected void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Data de Nascimento: " + data_nasc);
    }
}
