package player;

import interfaces.IJogador;
import interfaces.INotas;

import java.util.ArrayList;

import instancias.*;

public class Jogador implements IJogador{
    ArrayList<INotas> dinheiro = new ArrayList<INotas>();
    private int num;
    
    public Jogador(int num){
        this.bolsaInicial();
        this.num = num;
    }
    public void bolsaInicial(){
        InstanciaNotas not = new InstanciaNotas();
        this.dinheiro = not.instanciaNotas();
    }
    @Override
    public void atualiza(int i) {
        System.out.println("Vez do jogador:" + 1);
    }
    public int getNum(){
        return num;
    }
}