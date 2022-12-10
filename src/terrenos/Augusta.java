package terrenos;

import propriedades.Cor;
import propriedades.TerrenoBuilder;

public class Augusta extends TerrenoBuilder{
    @Override
    public void buildPreço() {
        terreno.setPreço(180);
        
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
            return 950;
        }
        else{
            switch (qntcasa) {
                case 1:
                    return 70;
                case 2:
                    return 200;
                case 3:
                    return 550;
                case 4:
                    return 750;
            
                default:
                    break;
            }
        }
        return 14;
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
        terreno.setCor(Cor.ROXO);
    }

    @Override
    public void buildNome() {
        terreno.setNome("Rua Algusta");
    }
}