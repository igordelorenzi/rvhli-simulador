/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package futebollive;

/**
 *
 * @author ranieri
 */
class Tatica {
    private boolean primeiro = false;
    private boolean segundo = false;
    private boolean terceiro = false;
    private boolean quarto = false;
    private boolean quinto = false;
    private boolean sexto = false;

    public Tatica(String estrategia) {
        System.out.println(estrategia);
        if(estrategia.substring(0, 1).equals("1")){
            this.primeiro = true;
        }
        if(estrategia.substring(1, 2).equals("1")){
            this.segundo = true;
        }
        if(estrategia.substring(2, 3).equals("1")){
            this.terceiro = true;
        }
        if(estrategia.substring(3, 4).equals("1")){
            this.quarto = true;
        }
        if(estrategia.substring(4, 5).equals("1")){
            this.quinto = true;
        }
        if(estrategia.substring(5, 6).equals("1")){
            this.quinto = true;
        }
    }

    /**
     * @return the primeiro
     */
    public boolean isPrimeiro(){
        return primeiro;
    }

    /**
     * @param primeiro the primeiro to set
     */
    public void setPrimeiro(boolean primeiro) {
        this.primeiro = primeiro;
    }

    /**
     * @return the segundo
     */
    public boolean isSegundo() {
        return segundo;
    }

    /**
     * @param segundo the segundo to set
     */
    public void setSegundo(boolean segundo) {
        this.segundo = segundo;
    }

    /**
     * @return the terceiro
     */
    public boolean isTerceiro() {
        return terceiro;
    }

    /**
     * @param terceiro the terceiro to set
     */
    public void setTerceiro(boolean terceiro) {
        this.terceiro = terceiro;
    }

    /**
     * @return the quarto
     */
    public boolean isQuarto() {
        return quarto;
    }

    /**
     * @param quarto the quarto to set
     */
    public void setQuarto(boolean quarto) {
        this.quarto = quarto;
    }

    /**
     * @return the quinto
     */
    public boolean isQuinto() {
        return quinto;
    }

    /**
     * @param quinto the quinto to set
     */
    public void setQuinto(boolean quinto) {
        this.quinto = quinto;
    }

    /**
     * @return the sexto
     */
    public boolean isSexto() {
        return sexto;
    }

    /**
     * @param sexto the quinto to set
     */
    public void setSexto(boolean sexto) {
        this.sexto = sexto;
    }
}
