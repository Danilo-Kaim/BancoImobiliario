package terrenos;

import propriedades.Cor;
import propriedades.TerrenoBuilder;

public class AvEuropa extends TerrenoBuilder{
    @Override
    public void buildPreço() {
        terreno.setPreço(200);
        
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
            return 1000;
        }
        else{
            switch (qntcasa) {
                case 1:
                    return 80;
                case 2:
                    return 220;
                case 3:
                    return 600;
                case 4:
                    return 800;
            
                default:
                    break;
            }
        }
        return 16;
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
        terreno.setNome("Av. Europa");
    }
}