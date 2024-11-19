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

    void exibirInfo() {
        System.out.println("matricula: " + matricula);
        System.out.println(serie);
        System.out.println(turma);
        System.out.println(turno);
        System.out.println(notas);
    }

}
