import javax.swing.*;
import java.util.ArrayList;

public class Menu extends JFrame {

    private ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
    private ArrayList<Aluno> listaAluno = new ArrayList<>();
    private int contadorMatricula = 1;
    private int matriculaFuncionario = 1;

    public Menu() {
        setTitle("Menu de Navegação");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnCadastrarAluno = new JButton("Cadastrar Aluno");
        btnCadastrarAluno.setBounds(100, 50, 200, 30);
        btnCadastrarAluno.addActionListener(e -> cadastrarAluno());
        add(btnCadastrarAluno);

        JButton btnVerAlunos = new JButton("Visualizar Alunos");
        btnVerAlunos.setBounds(100, 100, 200, 30);
        btnVerAlunos.addActionListener(e -> visualizarAlunos());
        add(btnVerAlunos);

        JButton btnRemoverAlunos = new JButton("Remover Aluno");
        btnRemoverAlunos.setBounds(100, 150, 200, 30);
        btnRemoverAlunos.addActionListener(e -> removerAluno());
        add(btnRemoverAlunos);

        JButton btnCadastrarFuncionario = new JButton("Cadastrar Funcionário");
        btnCadastrarFuncionario.setBounds(400, 50, 200, 30);
        btnCadastrarFuncionario.addActionListener(e -> cadastrarFuncionario());
        add(btnCadastrarFuncionario);

        JButton btnVerFuncionarios = new JButton("Visualizar Funcionários");
        btnVerFuncionarios.setBounds(400, 100, 200, 30);
        btnVerFuncionarios.addActionListener(e -> visualizarFuncionarios());
        add(btnVerFuncionarios);

        JButton btnRemoverFuncionario = new JButton("Remover Funcionario");
        btnRemoverFuncionario.setBounds(400, 150, 200, 30);
        btnRemoverFuncionario.addActionListener(e -> removerFuncionario());
        add(btnRemoverFuncionario);

        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(250, 250, 200, 30);
        btnSair.addActionListener(e -> System.exit(0));
        add(btnSair);

        setVisible(true);
    }

    private void cadastrarAluno() {
        Aluno novoAluno = new Aluno();
        novoAluno.catchInfo();
        novoAluno.setMatricula(contadorMatricula++);
        listaAluno.add(novoAluno);
        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
    }

    private void cadastrarFuncionario() {
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.catchInfo();
        novoFuncionario.setMatricula(matriculaFuncionario++);
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

    private void removerAluno(){
        if (listaAluno.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum aluno foi cadastrado para remover." );
            return;
        }
        String matriculaStr = JOptionPane.showInputDialog(this, "Insira a matricula do aluno a ser removido:");
        if (matriculaStr == null) return;

        int matricula = Integer.parseInt(matriculaStr);
        Aluno removerAluno = null;

        for(Aluno aluno : listaAluno){
            if (aluno.getMatricula() == matricula){
                removerAluno = aluno;
                break;
            }
        }

        if (removerAluno != null){
            listaAluno.remove(removerAluno);
            JOptionPane.showMessageDialog(this, "Aluno removido com sucesso!");
        }else {
            JOptionPane.showMessageDialog(this, "Matricula do aluno não encontrada!");
        }
    }

    private void removerFuncionario(){
        if (listaFuncionario.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum funcionario foi cadastrado para remover." );
            return;
        }
        String matriculaStr = JOptionPane.showInputDialog(this, "Insira a matricula do funcionario a ser removido:");
        if (matriculaStr == null) return;

        int matricula = Integer.parseInt(matriculaStr);
        Funcionario removerFuncionario = null;

        for(Funcionario funcionario : listaFuncionario){
            if (funcionario.getMatricula() == matricula){
                removerFuncionario = funcionario;
                break;
            }
        }

        if (removerFuncionario != null){
            listaFuncionario.remove(removerFuncionario);
            JOptionPane.showMessageDialog(this, "Funcionario removido com sucesso!");
        }else {
            JOptionPane.showMessageDialog(this, "Matricula de funcionario não encontrado!");
        }
    }

}import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuGUI extends JFrame {
    public MenuGUI() {
        ArrayList <Funcionario> listaFuncionario = new ArrayList<>();
        ArrayList <Aluno> listaAluno = new ArrayList<>();


        setTitle("Menu de Navegação");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        JButton btnCadastrarAluno = new JButton("Cadastrar Aluno");
        btnCadastrarAluno.setBounds(100, 50, 200, 30);
        btnCadastrarAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aluno novoAluno = new Aluno();
                novoAluno.catchInfo();
                listaAluno.add(novoAluno);
                JOptionPane.showConfirmDialog(null, "Aluno cadastrado com sucesso");
            }
        });
        add(btnCadastrarAluno);


        JButton btnCadastrarFuncionario = new JButton("Cadastrar Funcionario");
        btnCadastrarFuncionario.setBounds(100, 100, 200, 30);
        btnCadastrarFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Funcionario novofuncionario = new Funcionario();
                novofuncionario.catchInfo();

                listaFuncionario.add(novofuncionario);
            }
        });
        add(btnCadastrarFuncionario);

        JButton btnVerFuncionarios = new JButton("Visualizar Funcionarios");
        btnVerFuncionarios.setBounds(100, 150, 200, 30);
        btnVerFuncionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (listaFuncionario.isEmpty()){
                    JOptionPane.showConfirmDialog(null, "Nenhum funcionario foi cadastrado");
                }
                for (Funcionario funcionario1 : listaFuncionario) {
                    JOptionPane.showConfirmDialog(null, funcionario1);

                }
            }
        });
        add(btnVerFuncionarios);

        JButton btnVerAlunos = new JButton("Visualizar Alunos");
        btnVerAlunos.setBounds(100, 200, 200, 30);
        btnVerAlunos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (listaAluno.isEmpty()){
                    JOptionPane.showConfirmDialog(null, "Nenhum aluno foi cadastrado");
                }
                for (Aluno alunos : listaAluno) {
                    JOptionPane.showConfirmDialog(null, alunos);

                }
            }
        });
        add(btnVerAlunos);


        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(100, 250, 200, 30);
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        add(btnSair);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuGUI();
    }
}
