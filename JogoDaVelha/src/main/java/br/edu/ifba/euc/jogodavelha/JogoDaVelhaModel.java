package br.edu.ifba.euc.jogodavelha;

public class JogoDaVelhaModel {

    private String[][] posicoes;
    private String jogadoraDaVez;
    private Integer posicoesFaltantes;

    public JogoDaVelhaModel() {
        posicoes = new String[3][3];
        jogadoraDaVez = "X";
        posicoesFaltantes = 9;
        limpaTabuleiro();

    }

    private void limpaTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                posicoes[i][j] = "";
            }
        }
    }

    public Boolean isJogadaValida(Integer linha, Integer coluna) {
        return posicoes[linha][coluna].isEmpty();
    }

    public Boolean isJogadaVencedora() {

        for (int i = 0; i < 3; i++) { //3 linhas ou 3 colunas com mesmo símbolo
            if (posicoes[i][0].equals(jogadoraDaVez)
                    && posicoes[i][1].equals(jogadoraDaVez)
                    && posicoes[i][2].equals(jogadoraDaVez)) {
                return true;
            }
            
            if (posicoes[0][i].equals(jogadoraDaVez)
                    && posicoes[0][i].equals(jogadoraDaVez)
                    && posicoes[0][i].equals(jogadoraDaVez)) {
                return true;
            }
        }

        //Diagonais
        if (posicoes[0][0].equals(jogadoraDaVez)
                && posicoes[1][1].equals(jogadoraDaVez)
                && posicoes[2][2].equals(jogadoraDaVez)) {
            return true;
        }

        if (posicoes[2][0].equals(jogadoraDaVez)
                && posicoes[1][1].equals(jogadoraDaVez)
                && posicoes[0][2].equals(jogadoraDaVez)) {
            return true;
        }

        return false;
    }
    
    public Boolean isEmpate() {
        return posicoesFaltantes == 0;
    }

    public void mudaJogadoraDaVez(){
        jogadoraDaVez = (jogadoraDaVez.equals("X")) 
                            ? "O" : "X";
    }
        
    public String[][] getPosicoes() {
        return posicoes;
    }

    public void setPosicoes(String[][] posicoes) {
        this.posicoes = posicoes;
    }

    public String getJogadoraDaVez() {
        return jogadoraDaVez;
    }

    public void setJogadoraDaVez(String jogadoraDaVez) {
        this.jogadoraDaVez = jogadoraDaVez;
    }

    public Integer getPosicoesFaltantes() {
        return posicoesFaltantes;
    }

    public void setPosicoesFaltantes(Integer posicoesFaltantes) {
        this.posicoesFaltantes = posicoesFaltantes;
    }
    
    
}
