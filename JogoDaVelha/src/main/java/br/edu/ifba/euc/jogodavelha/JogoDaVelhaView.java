package br.edu.ifba.euc.jogodavelha;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JogoDaVelhaView extends JFrame{
    
    //Definir os componentes gráficos
    JButton[][] botoes;
    JLabel mensagem;
    JPanel painelDeBotoes;
    
    public JogoDaVelhaView() { //Método Construtor
        
        //Configurar os atributos da tela
        botoes = new JButton[3][3];
        mensagem = new JLabel("Mensagem Aqui!!!");
        setTitle("Jogo da Velha!");
        setSize(300, 350);
        setLayout(new BorderLayout());
        painelDeBotoes = new JPanel(new GridLayout(3,3));
        
    }
}
