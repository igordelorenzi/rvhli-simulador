/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package futebollive;

import java.util.Random;

/**
 *
 * @author ranieri
 */
public class Simulador {

    public void simular(Time time1, Time time2) {
        int gols1 = 0, gols2 = 0;
        class forcaTime {

            private float forca = 0;
            private float forcaAtaque = 0;
            private float forcaDefesa = 0;
            private float media = 0;
            private float coerencia = 0;
        }

        forcaTime forcaT1 = new forcaTime(), forcaT2 = new forcaTime();

        //calcula pontuação dos times
        forcaT1.media = time1.calculaMedia();
        forcaT2.media = time2.calculaMedia();
        forcaT1.coerencia = coerencia(time1);
        forcaT2.coerencia = coerencia(time2);
        forcaT1.forcaAtaque = pAtaque(time1) * forcaT1.coerencia / 10;
        forcaT2.forcaAtaque = pAtaque(time2) * forcaT2.coerencia / 10;
        forcaT1.forcaDefesa = pDefesa(time1) * forcaT1.coerencia / 10;
        forcaT2.forcaDefesa = pDefesa(time2) * forcaT2.coerencia / 10;
        System.out.println("m1:" + forcaT1.media);
        System.out.println("m2:" + forcaT2.media);
        System.out.println("a1:" + forcaT1.forcaAtaque);
        System.out.println("a2:" + forcaT2.forcaAtaque);
        System.out.println("d1:" + forcaT1.forcaDefesa);
        System.out.println("d2:" + forcaT2.forcaDefesa);
        System.out.println("c1:" + forcaT1.coerencia);
        System.out.println("c2:" + forcaT2.coerencia);

        //calcula pontuação entre times
        forcaT1.forca = forcaT1.forcaAtaque - forcaT2.forcaDefesa;
        forcaT2.forca = forcaT2.forcaAtaque - forcaT1.forcaDefesa;

        System.out.println("f1:" + forcaT1.forca);
        System.out.println("f2:" + forcaT2.forca);
        if (forcaT1.forca < 0) {
            forcaT1.forca = 5;
            forcaT2.forca += 5;
        } else if (forcaT1.forca < 10) {
            forcaT1.forca = 10;
            forcaT2.forca += 10;
        }
        if (forcaT2.forca < 0) {
            forcaT2.forca = 5;
            forcaT1.forca += 5;
        } else if (forcaT2.forca < 10) {
            forcaT2.forca = 10;
            forcaT1.forca += 10;
        }
        if (forcaT1.forca > 50) {
            forcaT1.forca = 50;
        }
        if (forcaT2.forca > 50) {
            forcaT2.forca = 50;
        }

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int ataque = r.nextInt(100), chance1 = r.nextInt(100), chance2 = r.nextInt(100);

            System.out.println("ataque:" + ataque);
            System.out.println("chance1:" + chance1);
            System.out.println("chance2:" + chance2);
            if (ataque <= forcaT1.forca) {
                System.out.println("time 1 atacando");
                if ((forcaT1.media + chance1) > (forcaT2.media + chance2)) {
                    gols1++;
                }
            } else if (ataque >= (100 - forcaT2.forca)) {

                System.out.println("time 2 atacando");
                if ((forcaT1.media + chance1) < (forcaT2.media + chance2)) {
                    gols2++;
                }
            }
        }
        //modulariza
        //gera numeros aleatorios
        //ve o que os numeros dizem
        //se for gol pra algum dos times atualiza banco com gol
        //retorna placar ou salva no BD
        System.out.println("time1 " + gols1 + " X " + gols2 + " time2");
    }

    private float coerencia(Time time) {
        float forca = 0;
        //primeiro ataque X defesa
        if (time.getTatica().isPrimeiro()) {
            forca += time.getFormacao().getDefensores();
        } else {
            forca += time.getFormacao().getAtacantes();
        }

        //terceiro laterais X meia
        if (time.getTatica().isTerceiro()) {
            forca += time.getFormacao().getCentrais();
        } else {
            forca += time.getFormacao().getLados();
        }
        return forca;
    }

    private float pDefesa(Time time) {
        float forca = 0;

        forca = time.mediaDefesa();
        forca += time.forcaGoleiro();
        forca += time.mediaForca() / 2;
        forca += time.mediaResistencia() / 3;

        //segundo marcação avançada X recuada
        if (time.getTatica().isSegundo()) {
            forca += time.mediaDefesaZaga();
            forca += time.mediaDefesaMeio() / 2;
        } else {
            forca += time.mediaDefesaZaga() / 2;
            forca += time.mediaDefesaMeio();
        }

        return forca;
    }

    private float pAtaque(Time time) {
        float forca = 0;

        //quarto toque X velocidade
        if (time.getTatica().isQuarto()) {
            forca += time.mediaToque() / 2;
            forca += time.mediaVelocidade();
        } else {
            forca += time.mediaVelocidade() / 2;
            forca += time.mediaToque();
        }

        //quinto passes de longe X perto
        if (time.getTatica().isQuinto()) {
            forca += time.mediaToque() / 2;
            forca += time.mediaDrible();
        } else {
            forca += time.mediaDrible() / 2;
            forca += time.mediaToque();
        }

        //sexto chute de longe X carregar a bola
        if (time.getTatica().isSexto()) {
            forca += time.mediaFinalizacao() / 2;
            forca += time.mediaDrible();
        } else {
            forca += time.mediaDrible() / 2;
            forca += time.mediaFinalizacao();
        }
        return forca;
    }
}
