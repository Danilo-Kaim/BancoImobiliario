package terrenos;

import propriedades.Cor;
import propriedades.TerrenoBuilder;

public class Botafogo extends TerrenoBuilder{
    @Override
    public void buildPreço() {
        terreno.setPreço(100);
        
    }

    @Override
    public void buildQntCasa() {
        terreno.setQntcasa(0);
        
    }

    @Override
    public void buildHotel() {
        terreno.setHotel(false);
        
    }

    @Override
    public int getAluguelTotal(Boolean hotel,int qntcasa) {
        if(hotel){
            return 500;
        }
        else{
            switch (qntcasa) {
                case 1:
                    return 30;
                case 2:
                    return 90;
                case 3:
                    return 270;
                case 4:
                    return 400;
            
                default:
                    break;
            }
        }
        return 6;
    }

    @Override
    public void comprarCasa() {
        if(terreno.getQntcasa()<3){
            terreno.setQntcasa(terreno.getQntcasa()+1);
        }        
    }

    @Override
    public void comprarHotel() {
        if(!(terreno.isHotel()) && (terreno.getQntcasa()==3)){
            terreno.setHotel(true);
        }
        
    }

    @Override
    public void buildCor() {
        terreno.setCor(Cor.VERMELHO);
    }

    @Override
    public void buildNome() {
        terreno.setNome("Botafogo");
        
    }
}