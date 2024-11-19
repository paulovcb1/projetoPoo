import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("matricula: ");
        int matricula = sc.nextInt();

        Aluno aluno1 = new Aluno("12/10/2030", 14, "145203", "victor hayakawa campos", matricula, 8, "vespertino", "tarde", 15);
        aluno1.exibirInfo();

        System.out.println("----------------------------------------------");

        Funcionario func1 = new Funcionario("07/11/2001", 23, "145203", "Girafales", "Professor", 8025.18);
        func1.exibirInfo();

        Aluno aluno4 = new Aluno();
        aluno4.catchInfo();
        ArrayList<Aluno> listaAluno = new ArrayList<>();
        listaAluno.add(aluno4);



        System.out.println("lista de alunos: ");
        for (Aluno aluno : listaAluno){
            System.out.println(aluno);
        }

    }
}
