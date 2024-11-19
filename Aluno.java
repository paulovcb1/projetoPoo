import javax.swing.*;
import java.util.Scanner;

public class Aluno extends Pessoa {
    private int matricula;
    private int  serie;
    private String turma;
    private String turno;
    private double notas;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public Aluno(String data_nasc,
                 int idade,
                 String cpf,
                 String nome,
                 int matricula,
                 int serie,
                 String turma,
                 String turno,
                 float notas) {


        super(data_nasc, idade, cpf, nome);
        this.matricula = matricula;
        this.serie = serie;
        this.turma = turma;
        this.turno = turno;
        this.notas = notas;
    }

    public Aluno () {}

    @Override
    public void catchInfo () {
        super.catchInfo();
        this.matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "insira sua matricula"));

        this.serie = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua serie"));


        this.turma = JOptionPane.showInputDialog(null, "Insira sua turma");


        this.notas = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua nota"));


        this.turno = JOptionPane.showInputDialog("turno");


    }

    @Override
    public String toString() {
        return   '\'' + super.toString() + "\n" +
                "Série: " + serie + '\'' + "\n" +
                "Turma: " + turma + "\n" +
                "Matrícula: " + matricula + '\'' + "\n" +
                "Turno: " + turno + '\'';

    }

}
