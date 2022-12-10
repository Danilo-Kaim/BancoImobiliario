package terrenos;

import propriedades.Cor;
import propriedades.TerrenoBuilder;

public class Morumbi extends TerrenoBuilder{
    @Override
    public void buildPreço() {
        terreno.setPreço(400);
        
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
            return 2000;
        }
        else{
            switch (qntcasa) {
                case 1:
                    return 200;
                case 2:
                    return 600;
                case 3:
                    return 1400;
                case 4:
                    return 1700;
            
                default:
                    break;
            }
        }
        return 50;
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
        terreno.setCor(Cor.LARENJA);
    }

    @Override
    public void buildNome() {
        terreno.setNome("Morumbi");
        
    }
}