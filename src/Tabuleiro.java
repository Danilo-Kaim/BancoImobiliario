
import java.util.ArrayList;
import java.util.Random;


import interfaces.IDeOlho;
import interfaces.IJogador;
import interfaces.IPropriedades;


public class Tabuleiro implements IDeOlho{
    private ArrayList<IJogador> jogadores = new ArrayList<IJogador>();
    private ArrayList<IPropriedades> casas = new ArrayList<IPropriedades>();
    private static Tabuleiro uniqueInstance = new Tabuleiro();
    private int jogadorAtual = 1;
    private Tabuleiro(){}
    public static Tabuleiro getInstance(){
        return uniqueInstance;
    }
    public void instancIPropriedades(ArrayList<IPropriedades> p){
        this.casas = p;
    }
    public ArrayList<IPropriedades> tabuleiro(){
        return casas;
    }
    public void setJogadores(ArrayList<IJogador> jogadores){
        this.jogadores = jogadores;
    }
    @Override
    public void adicionaObservador(IJogador jogador) {
        this.jogadores.add(jogador);
        
    }
    @Override
    public void removeObservador(IJogador jogador) {
        this.jogadores.remove(jogador);
        
    }
    @Override
    public void notifique() {
        for (IJogador ijogadores : jogadores) {
			ijogadores.atualiza(this.jogadorAtual);
		}
    }
    public int[] dados(){
        int[] resultado = new int[2];
        Random random = new Random();
        resultado[0] = random.nextInt(6) + 1;
        resultado[1] = random.nextInt(6) + 1;
        this.notifique();
        return resultado;
    }
}