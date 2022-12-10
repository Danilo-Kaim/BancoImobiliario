package interfaces;

import propriedades.Terreno;

public interface IPropriedades{
    public abstract void buildNome();
    public abstract void buildCor();
    public abstract void buildPreço();
    public abstract void buildQntCasa();
    public abstract void buildHotel();
    public abstract int getAluguelTotal(Boolean hotel,int qntcasa);
    public abstract void comprarCasa();
    public abstract void comprarHotel();
    public Terreno getTerreno();
}