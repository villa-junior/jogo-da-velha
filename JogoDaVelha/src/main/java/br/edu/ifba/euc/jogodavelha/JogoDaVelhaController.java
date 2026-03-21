package br.edu.ifba.euc.jogodavelha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class JogoDaVelhaController implements ActionListener{

    private JogoDaVelhaView view;
    private JogoDaVelhaModel model;

    public JogoDaVelhaController(JogoDaVelhaView view, JogoDaVelhaModel model) {
        this.view = view;
        this.model = model;
        this.view.setActionListeners(this); //Controlar os eventos da view
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        for(int linha = 0;linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                if (ae.getSource() == view.getBotoes()[linha][coluna]) {
                    System.out.println("Clicou no botao " + linha + ", " + coluna);
                    realizaJogada(linha, coluna);
                }
            }
        }
    }
    
    public void realizaJogada(int linha, int coluna){
        if(model.isJogadaValida(linha, coluna)){
            view.getBotoes()[linha][coluna].setText(model.getJogadoraDaVez());
            model.efetivaJogada(linha, coluna);
            if(model.isJogadaVencedora()){
                JOptionPane.showMessageDialog(view, "Jogador(a) " + model.getJogadoraDaVez() + " venceu!");
                model.limpaTabuleiro();
                System.exit(0);
            }else if(model.isEmpate()){
                JOptionPane.showMessageDialog(view, "Deu Velha!");
                model.limpaTabuleiro();
                System.exit(0);
            }else{
                model.mudaJogadoraDaVez();
                view.getMensagem().setText("Jogador(a) " + model.getJogadoraDaVez());
            }
        }
    }
}
