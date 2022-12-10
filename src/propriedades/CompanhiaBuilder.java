package propriedades;

import interfaces.IPropriedades;

public abstract class CompanhiaBuilder implements IPropriedades{
    protected Companhia companhia;

    public CompanhiaBuilder(){
        companhia = new Companhia();
    }
    public abstract void buildPreço();
    public abstract void buildMultiplicador();
    public abstract void buildNome();
    public abstract int valorPagar(int i);
    public Companhia getCompanhia(){
        return companhia;
    }
}