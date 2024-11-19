import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGUI extends JFrame {
    public MenuGUI() {
        // Configuração da janela principal
        setTitle("Menu de Navegação");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);



        // Botão para Cadastrar Aluno
        JButton btnCadastrarAluno = new JButton("Cadastrar Aluno");
        btnCadastrarAluno.setBounds(100, 50, 200, 30);
        btnCadastrarAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aluno aluno = new Aluno();
                aluno.catchInfo();
                JOptionPane.showMessageDialog(null, "Aluno cadastrado: " + aluno);
            }
        });
        add(btnCadastrarAluno);

        JButton btnCadastrarFuncionario = new JButton("Cadastrar Funcionario");
        btnCadastrarFuncionario.setBounds(100, 100, 200, 30);
        btnCadastrarFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Funcionario funcionario = new Funcionario();
                funcionario.catchInfo();
                JOptionPane.showMessageDialog(null, "Funcionario cadastrado: " + funcionario);
            }
        });
        add(btnCadastrarFuncionario);

        // Botão para Sair
        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(100, 150, 200, 30);
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Encerra o programa
            }
        });
        add(btnSair);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuGUI();
    }
}
