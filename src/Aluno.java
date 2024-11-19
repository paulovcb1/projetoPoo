
public class Aluno extends Pessoa {
    int matricula;
    int  serie;
    String turma;
    String turno;
    float notas;


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

    protected void exibirInfo() {
        super.exibirInfo();
        System.out.println("Matricula: " + matricula);
        System.out.println("Serie: " + serie);
        System.out.println("Turma: " + turma);
        System.out.println("Turno: " + turno);
        System.out.println("Notas: " + notas);
    }

}
