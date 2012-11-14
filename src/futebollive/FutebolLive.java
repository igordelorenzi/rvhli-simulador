/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package futebollive;

import ConexaoBanco.ConexaoMySQL;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ranieri
 */
public class FutebolLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time();
        Simulador simulador = new Simulador();

        //time 1
        t1.setTatica(new Tatica("101000"));
        t1.setFormacao(new Formacao("22220101"));
        Jogador j1 = new Jogador("1", 50, 50, 50, 50, 50, 50, 50, 50, 50);
        Jogador j2 = new Jogador("2", 50, 50, 50, 50, 50, 50, 50, 50, 50);
        Jogador j3 = new Jogador("3", 50, 50, 50, 50, 50, 50, 50, 50, 50);
        Jogador j4 = new Jogador("4", 50, 50, 50, 50, 50, 50, 50, 50, 50);
        Jogador j5 = new Jogador("5", 50, 50, 50, 50, 50, 50, 50, 50, 50);
        Jogador j6 = new Jogador("6", 50, 50, 50, 50, 50, 50, 50, 50, 50);
        Jogador j7 = new Jogador("7", 50, 50, 50, 50, 50, 50, 50, 50, 50);
        Jogador j8 = new Jogador("8", 50, 50, 50, 50, 50, 50, 50, 50, 50);
        Jogador j9 = new Jogador("9", 50, 50, 50, 50, 50, 50, 50, 50, 50);
        Jogador j10 = new Jogador("10", 50, 50, 50, 50, 50, 50, 50, 50, 50);
        Jogador j11 = new Jogador("11", 50, 50, 50, 50, 50, 50, 50, 50, 50);
        Jogando jog1 = new Jogando(j1, 0);
        Jogando jog2 = new Jogando(j2, 1);
        Jogando jog3 = new Jogando(j3, 1);
        Jogando jog4 = new Jogando(j4, 2);
        Jogando jog5 = new Jogando(j5, 2);
        Jogando jog6 = new Jogando(j6, 2);
        Jogando jog7 = new Jogando(j7, 3);
        Jogando jog8 = new Jogando(j8, 4);
        Jogando jog9 = new Jogando(j9, 4);
        Jogando jog10 = new Jogando(j10, 6);
        Jogando jog11 = new Jogando(j11, 7);
        HashMap<Integer, Jogando> plantel = new HashMap();
        plantel.put(1, jog1);//colocar no lugar dos inteiros o codigo do jogador
        plantel.put(2, jog2);
        plantel.put(3, jog3);
        plantel.put(4, jog4);
        plantel.put(5, jog5);
        plantel.put(6, jog6);
        plantel.put(7, jog7);
        plantel.put(8, jog8);
        plantel.put(9, jog9);
        plantel.put(10, jog10);
        plantel.put(11, jog11);
        t1.setPlantel(plantel);

        //time 2
        /*
         * t2.setTatica(new Tatica("101000")); t2.setFormacao(new
         * Formacao("22120201")); Jogador j12 = new Jogador("12", 50, 50, 0, 50,
         * 50, 50, 50, 50, 50); Jogador j13 = new Jogador("13", 50, 50, 0, 50,
         * 50, 50, 50, 50, 50); Jogador j14 = new Jogador("14", 50, 50, 0, 50,
         * 50, 50, 50, 50, 50); Jogador j15 = new Jogador("15", 50, 50, 0, 50,
         * 50, 50, 50, 50, 50); Jogador j16 = new Jogador("16", 50, 50, 0, 50,
         * 50, 50, 50, 50, 50); Jogador j17 = new Jogador("17", 50, 50, 0, 50,
         * 50, 50, 50, 50, 50); Jogador j18 = new Jogador("18", 50, 50, 0, 50,
         * 50, 50, 50, 50, 50); Jogador j19 = new Jogador("19", 50, 50, 0, 50,
         * 50, 50, 50, 50, 50); Jogador j20 = new Jogador("20", 50, 50, 0, 50,
         * 50, 50, 50, 50, 50); Jogador j21 = new Jogador("21", 50, 50, 0, 50,
         * 50, 50, 50, 50, 50); Jogador j22 = new Jogador("22", 50, 50, 0, 50,
         * 50, 50, 50, 50, 50);
         */
        Jogador j12 = new Jogador("12", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Jogador j13 = new Jogador("13", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Jogador j14 = new Jogador("14", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Jogador j15 = new Jogador("15", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Jogador j16 = new Jogador("16", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Jogador j17 = new Jogador("17", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Jogador j18 = new Jogador("18", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Jogador j19 = new Jogador("19", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Jogador j20 = new Jogador("20", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Jogador j21 = new Jogador("21", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Jogador j22 = new Jogador("22", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Jogando jog12 = new Jogando(j12, 0);
        Jogando jog13 = new Jogando(j13, 2);
        Jogando jog14 = new Jogando(j14, 2);
        Jogando jog15 = new Jogando(j15, 2);
        Jogando jog16 = new Jogando(j16, 3);
        Jogando jog17 = new Jogando(j17, 3);
        Jogando jog18 = new Jogando(j18, 4);
        Jogando jog19 = new Jogando(j19, 4);
        Jogando jog20 = new Jogando(j20, 5);
        Jogando jog21 = new Jogando(j21, 5);
        Jogando jog22 = new Jogando(j22, 7);
        HashMap<Integer, Jogando> plantel2 = new HashMap();
        plantel2.put(1, jog12);//colocar no lugar dos inteiros o codigo do jogador
        plantel2.put(2, jog13);
        plantel2.put(3, jog14);
        plantel2.put(4, jog15);
        plantel2.put(5, jog16);
        plantel2.put(6, jog17);
        plantel2.put(7, jog18);
        plantel2.put(8, jog19);
        plantel2.put(9, jog20);
        plantel2.put(10, jog21);
        plantel2.put(11, jog22);
        t2.setPlantel(plantel2);

        //conectando ao BD

        System.out.println(ConexaoMySQL.statusConection());
        Connection cn = ConexaoMySQL.getConexaoMySQL();
        System.out.println(ConexaoMySQL.statusConection());
        long timeID = 0;

        //carrega jogos de hoje
        try {
            String sql = "SELECT * FROM dono WHERE id = 1";
            ArrayList <Jogo> Jogos = new ArrayList<>();
            Statement stm = cn.createStatement();
            try {
                ResultSet rs = stm.executeQuery(sql);
                Jogador j = new Jogador();
                while (rs.next()) {
                    System.out.println(rs.getInt("id"));
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getString(3));
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } catch (Exception ex) {
            System.out.println("\nErro no statement!");
        }
        //para cada jogo de hoje pega os dois times e seus jogadores
        try {
            String sql = "SELECT * FROM dono WHERE dono = 1";
            Statement stm = cn.createStatement();
            try {
                ResultSet rs = stm.executeQuery(sql);
                Jogador j = new Jogador();
                while (rs.next()) {
                    System.out.println(rs.getInt("id"));
                    //j.setAtaque(rs.getInt("ataque"));
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getString(3));
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } catch (Exception ex) {
            System.out.println("\nErro no statement!");
        }


        //criar varias threads para simular varios jogos simultaneamente


        //carregar times da base de dados


        //simulador.simular(t1, t2);

        //colocar resultados na base de dados

    }
}
