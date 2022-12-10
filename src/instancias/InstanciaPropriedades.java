package instancias;

import interfaces.*;
import terrenos.*;
import companhias.*;

import java.util.ArrayList;

import casasrestantes.*;


public class InstanciaPropriedades {
    private ArrayList<IPropriedades> casas = new ArrayList<IPropriedades>();
    
    public void criaTabuleiro(){
        PontoPartida p = new PontoPartida();
        casas.add(p);
        Lebron l = new Lebron();
        casas.add(l);
        SorteRevez sr0 = new SorteRevez();
        casas.add(sr0);
        AvPresidenteVargas avpv = new AvPresidenteVargas();
        casas.add(avpv);
        AvNossaCopacabana avnc = new AvNossaCopacabana();
        casas.add(avnc);
        Ferroviaria cf = new Ferroviaria();
        casas.add((IPropriedades) cf);
        AvBrigadeiro avb = new AvBrigadeiro();
        casas.add(avb);
        Aviaçao cav = new Aviaçao();
        casas.add((IPropriedades) cav);
        AvRebouças avr = new AvRebouças();
        casas.add(avr);
        Av9Junho av9j = new Av9Junho();
        casas.add(av9j);
        Prisao pri = new Prisao();
        casas.add(pri);
        AvEuropa ave = new AvEuropa();
        casas.add(ave);
        SorteRevez sr1 = new SorteRevez();
        casas.add(sr1);
        Augusta rau = new Augusta();
        casas.add(rau);
        AvPacaebu avp = new AvPacaebu();
        casas.add(avp);
        Taxi cta = new Taxi();
        casas.add((IPropriedades) cta);
        SorteRevez sr2 = new SorteRevez();
        casas.add(sr2);
        Interlagos tin = new Interlagos();
        casas.add(tin);
        Lucro lu = new Lucro();
        casas.add(lu);
        Morumbi mo = new Morumbi();
        casas.add(mo);
        ParadaLivre pl = new ParadaLivre();
        casas.add(pl);
        Flamengo fla = new Flamengo();
        casas.add(fla);
        SorteRevez sr3 = new SorteRevez();
        casas.add(sr3);
        Botafogo bf = new Botafogo();
        casas.add(bf);
        Imposto imp = new Imposto();
        casas.add(imp);
        Navegação cna = new Navegação();
        casas.add((IPropriedades) cna);
        AvBrasil avbra = new AvBrasil();
        casas.add(avbra);
        SorteRevez sr4 = new SorteRevez();
        casas.add(sr4);
        AvPaulista avpa = new AvPaulista();
        casas.add(avpa);
        JardimEuropa je = new JardimEuropa();
        casas.add(je);
        VaiPrisao vpri = new VaiPrisao();
        casas.add(vpri);
        Copacabana copa = new Copacabana();
        casas.add(copa);
        Aviaçao cavi = new Aviaçao();
        casas.add((IPropriedades) cavi);
        AvVieraSouto avvs = new AvVieraSouto();
        casas.add(avvs);
        AvAtlantica avatlan = new AvAtlantica();
        casas.add(avatlan);
        TaxiAereo ctaero = new TaxiAereo();
        casas.add((IPropriedades) ctaero);
        Ipanema ipa = new Ipanema();
        casas.add(ipa);
        SorteRevez sr5 = new SorteRevez();
        casas.add(sr5);
        JardimPaulista jp = new JardimPaulista();
        casas.add(jp);
        Brooklin bro = new Brooklin();
        casas.add(bro);
        
    }
    public ArrayList<IPropriedades> getCasas() {
        return casas;
    }
}