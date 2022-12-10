package instancias;

import java.util.ArrayList;

import interfaces.IInstaciaJogador;
import interfaces.IJogador;
import player.Jogador;

public class InstanciaJogador implements IInstaciaJogador {

    @Override
    public ArrayList<IJogador> instanciaJogador(int jogadores) {
        ArrayList<IJogador> players = new ArrayList<IJogador>();
        switch (jogadores) {
            case 2:
                Jogador j1 = new Jogador(1);
                Jogador j2 = new Jogador(2);
                players.add(j1);
                players.add(j2);
                break;
            case 3:
                Jogador jo1 = new Jogador(1);
                Jogador jo2 = new Jogador(2);
                Jogador jo3 = new Jogador(3);
                players.add(jo1);
                players.add(jo2);
                players.add(jo3);
                break;
            case 4:
                Jogador jog1 = new Jogador(1);
                Jogador jog2 = new Jogador(2);
                Jogador jog3 = new Jogador(3);
                Jogador jog4 = new Jogador(4);
                players.add(jog1);
                players.add(jog2);
                players.add(jog3);
                players.add(jog4);
                break;
            case 5:
                Jogador jjJogador1 = new Jogador(1);
                Jogador jjJogador2 = new Jogador(2);
                Jogador jjJogador3 = new Jogador(3);
                Jogador jjJogador4 = new Jogador(4);
                Jogador jjJogador5 = new Jogador(5);
                players.add(jjJogador1);
                players.add(jjJogador2);
                players.add(jjJogador3);
                players.add(jjJogador4);
                players.add(jjJogador5);
                break;
            case 6:
                Jogador jogador1 = new Jogador(1);
                Jogador jogador2 = new Jogador(2);
                Jogador jogador3 = new Jogador(3);
                Jogador jogador4 = new Jogador(4);
                Jogador jogador5 = new Jogador(5);
                Jogador jogador6 = new Jogador(6);
                players.add(jogador1);
                players.add(jogador2);
                players.add(jogador3);
                players.add(jogador4);
                players.add(jogador5);
                players.add(jogador6);
                break;
        
            default:
                break;
        }
        return players;    
    }
    
}