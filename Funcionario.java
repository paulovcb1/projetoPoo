public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;



    public Funcionario(String data_nasc, int idade, String cpf, String nome, String cargo, double salario){
        super(data_nasc, idade, cpf, nome);
        this.cargo = cargo;
        this.salario = salario;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    protected void exibirInfo(){
        super.exibirInfo();
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

}
