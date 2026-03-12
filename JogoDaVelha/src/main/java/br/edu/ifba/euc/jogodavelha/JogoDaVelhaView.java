package br.edu.ifba.euc.jogodavelha;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
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
        painelDeBotoes = new JPanel(new GridLayout(3,3));
        for(int linha = 0;linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                botoes[linha][coluna] = new JButton();
                botoes[linha][coluna].setFont(new Font("Arial", Font.BOLD, 40));
                painelDeBotoes.add(botoes[linha][coluna]);
            }
        }
        add(painelDeBotoes, BorderLayout.CENTER);
        add(mensagem, BorderLayout.SOUTH);
    }
    
    //Componentes visual que terão eventos "escutados"
    public void setActionListeners(ActionListener listener) {

    }
    
    //Getters
    public JButton[][] getBotoes() {
        return botoes;
    }

    public JLabel getMensagem() {
        return mensagem;
    }
}
