package propriedades;

import interfaces.IPropriedades;

public abstract class TerrenoBuilder implements IPropriedades{
    protected Terreno terreno;

    public TerrenoBuilder(){
        terreno = new Terreno();
    }
    public abstract void buildNome();
    public abstract void buildCor();
    public abstract void buildPreço();
    public abstract void buildQntCasa();
    public abstract void buildHotel();
    public abstract int getAluguelTotal(Boolean hotel,int qntcasa);
    public abstract void comprarCasa();
    public abstract void comprarHotel();
    public Terreno getTerreno(){
        return terreno;
    }
}