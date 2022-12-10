package terrenos;

import propriedades.Cor;
import propriedades.TerrenoBuilder;

public class AvBrasil extends TerrenoBuilder{


    @Override
    public void buildPreço() {
        terreno.setPreço(160);
        
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
            return 900;
        }
        else{
            switch (qntcasa) {
                case 1:
                    return 60;
                case 2:
                    return 180;
                case 3:
                    return 500;
                case 4:
                    return 700;
            
                default:
                    break;
            }
        }
        return 12;
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
        terreno.setCor(Cor.AMARELO);
        
    }

    @Override
    public void buildNome() {
        terreno.setNome("Av. Brasil");
    }
    
}