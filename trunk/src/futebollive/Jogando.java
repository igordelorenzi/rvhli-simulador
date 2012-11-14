/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package futebollive;

/**
 *
 * @author ranieri
 */
class Jogando {
    private int posicao;
    private Jogador jogador;
    private int Nivel;
    
    public Jogando(Jogador jog, int posicao){
        this.jogador = jog;
        this.posicao = posicao;
        Nivel = 0;
        /*0 = Goleiro
        1 = Lateral
        2 = Zagueiro
        3 = Volante
        4 = Armador
        5 = Meio Lateral
        6 = Segundo Atacante
        7 = Atacante lateral
        8 = Centroavante*/
        if(posicao == 0){
            Nivel += jog.getAtaque() * 0;
            Nivel += jog.getDefesa() * 7;
            Nivel += jog.getVelocidade() * 3;
            Nivel += jog.getForca() * 0;
            Nivel += jog.getResistencia() * 1;
            Nivel += jog.getFinalizacao() * 0;
            Nivel += jog.getReflexo() * 8;
            Nivel += jog.getPasse() * 1;
            Nivel += jog.getDrible() * 0;
        }
        else if(posicao == 1){
            Nivel += jog.getAtaque() * 3;
            Nivel += jog.getDefesa() * 3;
            Nivel += jog.getVelocidade() * 5;
            Nivel += jog.getForca() * 1;
            Nivel += jog.getResistencia() * 2;
            Nivel += jog.getFinalizacao() * 2;
            Nivel += jog.getReflexo() * 0;
            Nivel += jog.getPasse() * 2;
            Nivel += jog.getDrible() * 2;
        }
        else if(posicao == 2){
            Nivel += jog.getAtaque() * 0;
            Nivel += jog.getDefesa() * 5;
            Nivel += jog.getVelocidade() * 2;
            Nivel += jog.getForca() * 5;
            Nivel += jog.getResistencia() * 3;
            Nivel += jog.getFinalizacao() * 1;
            Nivel += jog.getReflexo() * 2;
            Nivel += jog.getPasse() * 1;
            Nivel += jog.getDrible() * 1;
        }
        else if(posicao == 3){
            Nivel += jog.getAtaque() * 2;
            Nivel += jog.getDefesa() * 3;
            Nivel += jog.getVelocidade() * 1;
            Nivel += jog.getForca() * 4;
            Nivel += jog.getResistencia() * 5;
            Nivel += jog.getFinalizacao() * 2;
            Nivel += jog.getReflexo() * 1;
            Nivel += jog.getPasse() * 2;
            Nivel += jog.getDrible() * 0;
        }
        else if(posicao == 4){
            Nivel += jog.getAtaque() * 4;
            Nivel += jog.getDefesa() * 1;
            Nivel += jog.getVelocidade() * 2;
            Nivel += jog.getForca() * 2;
            Nivel += jog.getResistencia() * 1;
            Nivel += jog.getFinalizacao() * 3;
            Nivel += jog.getReflexo() * 0;
            Nivel += jog.getPasse() * 5;
            Nivel += jog.getDrible() * 2;
        }
        else if(posicao == 5){
            Nivel += jog.getAtaque() * 3;
            Nivel += jog.getDefesa() * 2;
            Nivel += jog.getVelocidade() * 4;
            Nivel += jog.getForca() * 1;
            Nivel += jog.getResistencia() * 2;
            Nivel += jog.getFinalizacao() * 2;
            Nivel += jog.getReflexo() * 0;
            Nivel += jog.getPasse() * 3;
            Nivel += jog.getDrible() * 3;
        }
        else if(posicao == 6){
            Nivel += jog.getAtaque() * 4;
            Nivel += jog.getDefesa() * 0;
            Nivel += jog.getVelocidade() * 3;
            Nivel += jog.getForca() * 3;
            Nivel += jog.getResistencia() * 1;
            Nivel += jog.getFinalizacao() * 4;
            Nivel += jog.getReflexo() * 0;
            Nivel += jog.getPasse() * 3;
            Nivel += jog.getDrible() * 2;
        }
        else if(posicao == 7){
            Nivel += jog.getAtaque() * 4;
            Nivel += jog.getDefesa() * 0;
            Nivel += jog.getVelocidade() * 4;
            Nivel += jog.getForca() * 2;
            Nivel += jog.getResistencia() * 1;
            Nivel += jog.getFinalizacao() * 3;
            Nivel += jog.getReflexo() * 0;
            Nivel += jog.getPasse() * 2;
            Nivel += jog.getDrible() * 4;
        }
        else if(posicao == 8){
            Nivel += jog.getAtaque() * 5;
            Nivel += jog.getDefesa() * 0;
            Nivel += jog.getVelocidade() * 1;
            Nivel += jog.getForca() * 4;
            Nivel += jog.getResistencia() * 2;
            Nivel += jog.getFinalizacao() * 5;
            Nivel += jog.getReflexo() * 0;
            Nivel += jog.getPasse() * 1;
            Nivel += jog.getDrible() * 2;
        }
        Nivel = Nivel/10;
    }
    /**
     * @return the posicao
     */
    public int getPosicao() {
        return posicao;
    }

    /**
     * @param posicao the posicao to set
     */
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    /**
     * @return the jogador
     */
    public Jogador getJogador() {
        return jogador;
    }

    /**
     * @param jogador the jogador to set
     */
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    /**
     * @return the Nivel
     */
    public int getNivel() {
        return Nivel;
    }

    /**
     * @param Nivel the Nivel to set
     */
    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }
    
    
}
