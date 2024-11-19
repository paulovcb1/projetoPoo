public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    public Funcionario(String data_nasc, int idade, String cpf, String nome, String cargo, double salario){
        super(data_nasc, idade, cpf, nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    protected void exibirInfo(){
        super.exibirInfo();
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

}
