/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package futebollive;

/**
 *
 * @author ranieri
 */
class Formacao {

    private int nZ;
    private int nL;
    private int nV;
    private int nMC;
    private int nML;
    private int nSA;
    private int nAL;
    private int nC;

    public Formacao(String form) {
        this.nZ = Integer.parseInt(form.substring(0, 1));
        this.nL = Integer.parseInt(form.substring(1, 2));
        this.nV = Integer.parseInt(form.substring(2, 3));
        this.nMC = Integer.parseInt(form.substring(3, 4));
        this.nML = Integer.parseInt(form.substring(4, 5));
        this.nSA = Integer.parseInt(form.substring(5, 6));
        this.nAL = Integer.parseInt(form.substring(6, 7));
        this.nC = Integer.parseInt(form.substring(7, 8));
    }

    //max = 5 min = 3
    public int getZaga() {
        return this.nZ + this.nL;
    }

    //max = 6.5 min = 3
    public float getDefensores() {
        return this.nZ + this.nL + this.nV/2;
    }

    //max = 5.5 min = 2
    public float getAtacantes() {
        return (this.nSA + this.nC + this.nAL + ((this.nMC + this.nML) / 2));
    }
    
    //max = 6 min = 0
    public float getLados (){
        return this.nL/2+this.nML+this.nAL*3/2;
    }
    
    //max = 6 min = 1
    public float getCentrais(){
        return this.nMC+this.nSA+this.nC*3/2;
    }

    /**
     * @return the nZ
     */
    public int getnZ() {
        return nZ;
    }

    /**
     * @param nZ the nZ to set
     */
    public void setnZ(int nZ) {
        this.nZ = nZ;
    }

    /**
     * @return the nL
     */
    public int getnL() {
        return nL;
    }

    /**
     * @param nL the nL to set
     */
    public void setnL(int nL) {
        this.nL = nL;
    }

    /**
     * @return the nV
     */
    public int getnV() {
        return nV;
    }

    /**
     * @param nV the nV to set
     */
    public void setnV(int nV) {
        this.nV = nV;
    }

    /**
     * @return the nMC
     */
    public int getnMC() {
        return nMC;
    }

    /**
     * @param nMC the nMC to set
     */
    public void setnMC(int nMC) {
        this.nMC = nMC;
    }

    /**
     * @return the nML
     */
    public int getnML() {
        return nML;
    }

    /**
     * @param nML the nML to set
     */
    public void setnML(int nML) {
        this.nML = nML;
    }

    /**
     * @return the nSA
     */
    public int getnSA() {
        return nSA;
    }

    /**
     * @param nSA the nSA to set
     */
    public void setnSA(int nSA) {
        this.nSA = nSA;
    }

    /**
     * @return the nAL
     */
    public int getnAL() {
        return nAL;
    }

    /**
     * @param nAL the nAL to set
     */
    public void setnAL(int nAL) {
        this.nAL = nAL;
    }

    /**
     * @return the nC
     */
    public int getnC() {
        return nC;
    }

    /**
     * @param nC the nC to set
     */
    public void setnC(int nC) {
        this.nC = nC;
    }
}
