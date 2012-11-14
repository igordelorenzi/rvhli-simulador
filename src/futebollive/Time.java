/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package futebollive;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author ranieri
 */
public class Time {

    private int id;
    private Formacao form;
    public Tatica tatica;
    private Estrategia estrategia;
    private HashMap<Integer, Jogando> plantel = new HashMap();
    private int Nivel;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the form
     */
    public Formacao getFormacao() {
        return form;
    }

    /**
     * @param form the form to set
     */
    public void setFormacao(Formacao form) {
        this.form = form;
    }

    /**
     * @return the tatica
     */
    public Tatica getTatica() {
        return tatica;
    }

    /**
     * @param tatica the tatica to set
     */
    public void setTatica(Tatica tatica) {
        this.tatica = tatica;
    }

    /**
     * @return the estrategia
     */
    public Estrategia getEstrategia() {
        return estrategia;
    }

    /**
     * @param estrategia the estrategia to set
     */
    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    /**
     * @return the plantel
     */
    public HashMap<Integer, Jogando> getPlantel() {
        return plantel;
    }

    /**
     * @param plantel the plantel to set
     */
    public void setPlantel(HashMap<Integer, Jogando> plantel) {
        this.plantel = plantel;
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

    public float calculaMedia() {
        float media = 0;
        Set<Integer> chaves = this.plantel.keySet();
        for (Integer chave : chaves) {
            if (chave != null) {
                media += this.plantel.get(chave).getNivel();
            }
        }
        if (this.plantel.size() > 0) {
            media = media / this.plantel.size();
        }
        return media;
    }

    public float mediaDefesa() {
        float media = 0;
        Set<Integer> chaves = this.plantel.keySet();
        for (Integer chave : chaves) {
            if (chave != null) {
                media += this.plantel.get(chave).getJogador().getDefesa();
            }
        }
        if (this.plantel.size() > 0) {
            media = media / this.plantel.size();
        }
        return media;
    }

    public float mediaForca() {
        float media = 0;
        Set<Integer> chaves = this.plantel.keySet();
        for (Integer chave : chaves) {
            if (chave != null) {
                media += this.plantel.get(chave).getJogador().getForca();
            }
        }
        if (this.plantel.size() > 0) {
            media = media / this.plantel.size();
        }
        return media;
    }

    public float mediaResistencia() {
        float media = 0;
        Set<Integer> chaves = this.plantel.keySet();
        for (Integer chave : chaves) {
            if (chave != null) {
                media += this.plantel.get(chave).getJogador().getResistencia();
            }
        }
        if (this.plantel.size() > 0) {
            media = media / this.plantel.size();
        }
        return media;
    }

    public float mediaDefesaZaga() {
        float media = 0;
        int cont = 0;
        Set<Integer> chaves = this.plantel.keySet();
        for (Integer chave : chaves) {
            if (chave != null) {
                if (this.plantel.get(chave).getPosicao() == 1 || this.plantel.get(chave).getPosicao() == 2 ||
                        this.plantel.get(chave).getPosicao() == 0) {
                    media += this.plantel.get(chave).getJogador().getDefesa();
                    cont++;
                }
            }
        }
        if (cont > 0) {
            media = media / cont;
        }
        return media;
    }

    public float mediaDefesaMeio() {
        float media = 0;
        int cont = 0;
        Set<Integer> chaves = this.plantel.keySet();
        for (Integer chave : chaves) {
            if (chave != null) {
                if (this.plantel.get(chave).getPosicao() == 3 || this.plantel.get(chave).getPosicao() == 4
                        || this.plantel.get(chave).getPosicao() == 5) {
                    media += this.plantel.get(chave).getJogador().getDefesa();
                    cont++;
                }
            }
        }
        if (cont > 0) {
            media = media / cont;
        }
        return media;
    }

    public float mediaToque() {
        float media = 0;
        int cont = 0;
        Set<Integer> chaves = this.plantel.keySet();
        for (Integer chave : chaves) {
            if (chave != null) {
                if (this.plantel.get(chave).getPosicao() == 4 || this.plantel.get(chave).getPosicao() == 5
                        || this.plantel.get(chave).getPosicao() == 6) {
                    media += this.plantel.get(chave).getJogador().getPasse();
                    cont++;
                }
            }
        }
        if (cont > 0) {
            media = media / cont;
        }
        return media;
    }

    public float mediaVelocidade() {
        float media = 0;
        int cont = 0;
        Set<Integer> chaves = this.plantel.keySet();
        for (Integer chave : chaves) {
            if (chave != null) {
                if (this.plantel.get(chave).getPosicao() == 1 || this.plantel.get(chave).getPosicao() == 5
                        || this.plantel.get(chave).getPosicao() == 7) {
                    media += this.plantel.get(chave).getJogador().getVelocidade();
                    cont++;
                }
            }
        }
        if (cont > 0) {
            media = media / cont;
        }
        return media;
    }

    public float mediaFinalizacao() {
        float media = 0;
        int cont = 0;
        Set<Integer> chaves = this.plantel.keySet();
        for (Integer chave : chaves) {
            if (chave != null) {
                if (this.plantel.get(chave).getPosicao() >= 4) {
                    media += this.plantel.get(chave).getJogador().getFinalizacao();
                    cont++;
                }
            }
        }
        if (cont > 0) {
            media = media / cont;
        }
        return media;
    }

    public float mediaDrible() {
        float media = 0;
        int cont = 0;
        Set<Integer> chaves = this.plantel.keySet();
        for (Integer chave : chaves) {
            if (chave != null) {
                if (this.plantel.get(chave).getPosicao() == 5 || this.plantel.get(chave).getPosicao() == 7) {
                    media += this.plantel.get(chave).getJogador().getDrible();
                    cont++;
                }
            }
        }
        if (cont > 0) {
            media = media / cont;
        }
        return media;
    }
    
    public float forcaGoleiro() {
        float media = 0;
        Set<Integer> chaves = this.plantel.keySet();
        for (Integer chave : chaves) {
            if (chave != null) {
                if (this.plantel.get(chave).getPosicao() == 0) {
                    media += this.plantel.get(chave).getJogador().getDrible();
                }
            }
        }
        return media;
    }
}
