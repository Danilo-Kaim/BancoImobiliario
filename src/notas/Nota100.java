package notas;

import interfaces.INotas;

public class Nota100 implements INotas{

    private int quantidade = 0;
    @Override
    public int valor() {
        return 100;
    }
    @Override
    public int quantidade() {
        return this.quantidade;
    }
    @Override
    public void ganhar(int i) {
        this.quantidade += i;
    }
    
}