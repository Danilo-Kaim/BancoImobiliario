package terrenos;

import propriedades.Cor;
import propriedades.TerrenoBuilder;

public class JardimPaulista extends TerrenoBuilder{
    @Override
    public void buildPreço() {
        terreno.setPreço(280);
        
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
            return 1200;
        }
        else{
            switch (qntcasa) {
                case 1:
                    return 120;
                case 2:
                    return 360;
                case 3:
                    return 850;
                case 4:
                    return 1025;
            
                default:
                    break;
            }
        }
        return 24;
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
        terreno.setCor(Cor.MARINHO);
        
    }

    @Override
    public void buildNome() {
        terreno.setNome("Jardim Paulista");
        
    }
}