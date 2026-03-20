package br.edu.ifba.euc.jogodavelha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDaVelhaController implements ActionListener{

    private JogoDaVelhaView view;

    public JogoDaVelhaController(JogoDaVelhaView view) {
        this.view = view;
        this.view.setActionListeners(this); //Controlar os eventos da view
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        for(int linha = 0;linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                if (ae.getSource() == view.getBotoes()[linha][coluna]) {
                    System.out.println("Clicou no botao " + linha + ", " + coluna);
                }
            }
        }
    }
    
}
