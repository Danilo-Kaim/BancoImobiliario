package terrenos;

import propriedades.Cor;
import propriedades.TerrenoBuilder;

public class AvBrigadeiro extends TerrenoBuilder {
    @Override
    public void buildPreço() {
        terreno.setPreço(240);
        
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
            return 1100;
        }
        else{
            switch (qntcasa) {
                case 1:
                    return 100;
                case 2:
                    return 300;
                case 3:
                    return 750;
                case 4:
                    return 1100;
            
                default:
                    break;
            }
        }
        return 20;
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
        terreno.setCor(Cor.AZUL);
        
    }

    @Override
    public void buildNome() {
        terreno.setNome("Av. Brigadeiro Faria de Lima");
    }
}