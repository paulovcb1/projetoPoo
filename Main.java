import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("matricula: ");
        int matricula = sc.nextInt();

        Aluno p1 = new Aluno("12/10/2030", 14, "145203", "victor hayakawa campos", matricula, 8, "vespertino", "tarde", 15);
        p1.exibirInfo();
    }
}