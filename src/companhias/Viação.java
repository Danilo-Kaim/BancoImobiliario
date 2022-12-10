package companhias;

import propriedades.CompanhiaBuilder;
import propriedades.Terreno;

public class Viação extends CompanhiaBuilder{
    @Override
    public void buildPreço() {
        companhia.setPreço(200);
        
    }

    @Override
    public void buildMultiplicador() {
        companhia.setMultiplicador(50);
        
    }

    @Override
    public void buildNome() {
        companhia.setNome("Companhia de Viação");
        
    }

    @Override
    public int valorPagar(int i) {
        
        return companhia.getMultiplicador()*i;
    }

    @Override
    public void buildCor() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void buildQntCasa() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void buildHotel() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getAluguelTotal(Boolean hotel, int qntcasa) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void comprarCasa() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void comprarHotel() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Terreno getTerreno() {
        // TODO Auto-generated method stub
        return null;
    }
}