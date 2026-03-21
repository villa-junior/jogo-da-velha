package br.edu.ifba.euc.jogodavelha;

import javax.swing.SwingUtilities;

public class JogoDaVelha {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() { 
            @Override 
            public void run() { 
                JogoDaVelhaView view = new JogoDaVelhaView();
                JogoDaVelhaModel model = new JogoDaVelhaModel();
                new JogoDaVelhaController(view, model);
                view.setVisible(true);
            }
        });
     
    }
}
