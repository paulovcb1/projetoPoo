import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuGUI extends JFrame {
    public MenuGUI() {
        ArrayList <Funcionario> listaFuncionario = new ArrayList<>();
        ArrayList <Aluno> listaAluno = new ArrayList<>();

        // Configuração da janela principal
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
