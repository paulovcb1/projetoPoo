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
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu matricula: ");
        this.matricula = sc.nextInt();

        System.out.println("Digite seu serie: ");
        this.serie = sc.nextInt();

        System.out.println("Digite seu turma: ");
        sc.nextLine();
        this.turma = sc.nextLine();

        System.out.println("Digite sua nota ");
        this.notas = sc.nextDouble();

        sc.nextLine();
    }

    @Override
    public String toString() {
        return  "Alunos" + '\'' + super.toString() +
                "serie='" + serie + '\'' +
                ", turma=" + turma +
                ", matricula='" + matricula + '\'' +
                "turno= " + turno + '\'';
    }

}
