package br.edu.ifba.euc.jogodavelha;

import javax.swing.SwingUtilities;

public class JogoDaVelha {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() { 
            @Override 
            public void run() { 
                JogoDaVelhaView view = new JogoDaVelhaView();
                new JogoDaVelhaController(view);
                view.setVisible(true);
            }
        });
     
    }
}
