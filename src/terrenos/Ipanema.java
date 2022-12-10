package terrenos;

import propriedades.Cor;
import propriedades.TerrenoBuilder;

public class Ipanema extends TerrenoBuilder{
    @Override
    public void buildPreço() {
        terreno.setPreço(300);
        
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
            return 1275;
        }
        else{
            switch (qntcasa) {
                case 1:
                    return 130;
                case 2:
                    return 390;
                case 3:
                    return 900;
                case 4:
                    return 1100;
            
                default:
                    break;
            }
        }
        return 26;
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
        terreno.setNome("Ipanema");
    }
}