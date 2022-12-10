package casasrestantes;

import interfaces.IPropriedades;
import propriedades.Terreno;

public class ParadaLivre implements IPropriedades {
    private String nome = "ParadaLivre";
    

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void buildNome() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void buildCor() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void buildPreço() {
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