package terrenos;

import propriedades.Cor;
import propriedades.TerrenoBuilder;

public class AvVieraSouto extends TerrenoBuilder{
    @Override
    public void buildPreço() {
        terreno.setPreço(320);
        
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
            return 1400;
        }
        else{
            switch (qntcasa) {
                case 1:
                    return 150;
                case 2:
                    return 450;
                case 3:
                    return 1000;
                case 4:
                    return 1200;
            
                default:
                    break;
            }
        }
        return 28;
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
        terreno.setCor(Cor.VERDE);
        
    }

    @Override
    public void buildNome() {
        terreno.setNome("Av. Vieira Souto");
    }
}