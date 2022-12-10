import java.util.ArrayList;
import java.util.Scanner;

import instancias.InstanciaJogador;
import instancias.InstanciaPropriedades;
import interfaces.*;


public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Scanner scan = new Scanner(System.in);
        Tabuleiro tabuleiro = Tabuleiro.getInstance();
        int numJogadores = scan.nextInt();
        InstanciaJogador j = new InstanciaJogador();
        tabuleiro.setJogadores(j.instanciaJogador(numJogadores));
        InstanciaPropriedades p = new InstanciaPropriedades();
        p.criaTabuleiro();
        ArrayList<IPropriedades> p1 = new ArrayList<IPropriedades>();
        p1 = p.getCasas();
        System.out.println(p1.get(1).getClass());
        tabuleiro.notifique();
    }
}