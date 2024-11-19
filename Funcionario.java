import javax.swing.*;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;



    public Funcionario(String data_nasc, int idade, String cpf, String nome, String cargo, double salario){
        super(data_nasc, idade, cpf, nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario () {

    }
    @Override
    public void catchInfo () {
        super.catchInfo();

        this.cargo = JOptionPane.showInputDialog(null, "insira seu cargo");
        this.salario = Double.parseDouble(JOptionPane.showInputDialog(null, "insira seu salario"));

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



   @Override

    public String toString () {
        return "\n" + '\'' + super.toString() + "\n" +
                "Cargo: " + cargo + '\'' + "\n" +
                "salario: " + salario + "\n";

   }

}

