package terrenos;

import propriedades.Cor;
import propriedades.TerrenoBuilder;

public class Av9Junho extends TerrenoBuilder{
    @Override
    public void buildPreço() {
        terreno.setPreço(220);
        
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
            return 1050;
        }
        else{
            switch (qntcasa) {
                case 1:
                    return 90;
                case 2:
                    return 250;
                case 3:
                    return 700;
                case 4:
                    return 875;
            
                default:
                    break;
            }
        }
        return 18;
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
        terreno.setNome("Av. 9 de Julho");
    }
}