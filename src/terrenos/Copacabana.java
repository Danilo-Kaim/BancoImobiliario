package terrenos;

import propriedades.Cor;
import propriedades.TerrenoBuilder;

public class Copacabana extends TerrenoBuilder{
    @Override
    public void buildPreço() {
        terreno.setPreço(260);
        
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
            return 1150;
        }
        else{
            switch (qntcasa) {
                case 1:
                    return 110;
                case 2:
                    return 330;
                case 3:
                    return 800;
                case 4:
                    return 975;
            
                default:
                    break;
            }
        }
        return 22;
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
        terreno.setNome("Copacabana");
    }
}