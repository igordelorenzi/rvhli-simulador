/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package futebollive;

/**
 *
 * @author ranieri
 */
public class Jogador {
    private String nome;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int forca;
    private int resistencia;
    private int finalizacao;
    private int reflexo;
    private int passe;
    private int drible;
    
    public Jogador(String nome, int ataque, int defesa, int velocidade, int forca, int resistencia, int finalizacao,
            int reflexo, int passe, int drible){
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.forca = forca;
        this.resistencia = resistencia;
        this.finalizacao = finalizacao;
        this.reflexo = reflexo;
        this.passe = passe;
        this.drible = drible;
    }

    Jogador() {
    }

    /**
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the defesa
     */
    public int getDefesa() {
        return defesa;
    }

    /**
     * @param defesa the defesa to set
     */
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return the força
     */
    public int getForca() {
        return forca;
    }

    /**
     * @param força the força to set
     */
    public void setForca(int forca) {
        this.forca = forca;
    }

    /**
     * @return the resistencia
     */
    public int getResistencia() {
        return resistencia;
    }

    /**
     * @param resistencia the resistencia to set
     */
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    /**
     * @return the finalizacao
     */
    public int getFinalizacao() {
        return finalizacao;
    }

    /**
     * @param finalizacao the finalizacao to set
     */
    public void setFinalizacao(int finalizacao) {
        this.finalizacao = finalizacao;
    }

    /**
     * @return the reflexo
     */
    public int getReflexo() {
        return reflexo;
    }

    /**
     * @param reflexo the reflexo to set
     */
    public void setReflexo(int reflexo) {
        this.reflexo = reflexo;
    }

    /**
     * @return the passe
     */
    public int getPasse() {
        return passe;
    }

    /**
     * @param passe the passe to set
     */
    public void setPasse(int passe) {
        this.passe = passe;
    }

    /**
     * @return the drible
     */
    public int getDrible() {
        return drible;
    }

    /**
     * @param drible the drible to set
     */
    public void setDrible(int drible) {
        this.drible = drible;
    }

    public String getNome() {
        return this.nome;
    }
}
