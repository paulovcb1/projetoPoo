import javax.swing.*;
import java.util.ArrayList;

public class MenuGUI extends JFrame {

    private ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
    private ArrayList<Aluno> listaAluno = new ArrayList<>();

    public MenuGUI() {
        setTitle("Menu de Navegação");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        JButton btnCadastrarAluno = new JButton("Cadastrar Aluno");
        btnCadastrarAluno.setBounds(100, 50, 200, 30);
        btnCadastrarAluno.addActionListener(e -> cadastrarAluno());
        add(btnCadastrarAluno);


        JButton btnCadastrarFuncionario = new JButton("Cadastrar Funcionário");
        btnCadastrarFuncionario.setBounds(100, 100, 200, 30);
        btnCadastrarFuncionario.addActionListener(e -> cadastrarFuncionario());
        add(btnCadastrarFuncionario);


        JButton btnVerFuncionarios = new JButton("Visualizar Funcionários");
        btnVerFuncionarios.setBounds(100, 150, 200, 30);
        btnVerFuncionarios.addActionListener(e -> visualizarFuncionarios());
        add(btnVerFuncionarios);


        JButton btnVerAlunos = new JButton("Visualizar Alunos");
        btnVerAlunos.setBounds(100, 200, 200, 30);
        btnVerAlunos.addActionListener(e -> visualizarAlunos());
        add(btnVerAlunos);


        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(100, 250, 200, 30);
        btnSair.addActionListener(e -> System.exit(0));
        add(btnSair);

        setVisible(true);
    }

    private void cadastrarAluno() {
        Aluno novoAluno = new Aluno();
        novoAluno.catchInfo();
        listaAluno.add(novoAluno);
        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
    }

    private void cadastrarFuncionario() {
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.catchInfo();
        listaFuncionario.add(novoFuncionario);
        JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!");
    }

    private void visualizarFuncionarios() {
        if (listaFuncionario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum funcionário foi cadastrado.");
            return;
        }

        StringBuilder mensagem = new StringBuilder("Funcionários cadastrados:\n");
        for (Funcionario funcionario : listaFuncionario) {
            mensagem.append(funcionario).append("\n");
        }
        JOptionPane.showMessageDialog(this, mensagem.toString());
    }

    private void visualizarAlunos() {
        if (listaAluno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum aluno foi cadastrado.");
            return;
        }

        StringBuilder mensagem = new StringBuilder("Alunos cadastrados:\n");
        for (Aluno aluno : listaAluno) {
            mensagem.append(aluno).append("\n");
        }
        JOptionPane.showMessageDialog(this, mensagem.toString());
    }

    public static void main(String[] args) {
        new MenuGUI();
    }
}
