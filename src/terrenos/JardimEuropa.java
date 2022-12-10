package terrenos;

import propriedades.Cor;
import propriedades.TerrenoBuilder;

public class JardimEuropa extends TerrenoBuilder{
    @Override
    public void buildPreço() {
        terreno.setPreço(140);
        
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
            return 700;
        }
        else{
            switch (qntcasa) {
                case 1:
                    return 50;
                case 2:
                    return 150;
                case 3:
                    return 450;
                case 4:
                    return 625;
            
                default:
                    break;
            }
        }
        return 10;
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
        terreno.setNome("Jardim Europa");
        
    }
}