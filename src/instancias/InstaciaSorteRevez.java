package instancias;

import interfaces.*;


import cartas.Revez;

import cartas.*;
import java.util.ArrayList;

public class InstaciaSorteRevez {
    private ArrayList<ISorteRevez> sorteRevez = new ArrayList<ISorteRevez>();
    
    public void criaSorteRevez() {
        Revez re0 = new Revez();
        sorteRevez.add(re0);
        Revez1 re1 = new Revez1();
        sorteRevez.add(re1);
        Revez2 re2 = new Revez2();
        sorteRevez.add(re2);
        Revez3 re3 = new Revez3();
        sorteRevez.add(re3);
        Revez4 re4 = new Revez4();
        sorteRevez.add(re4);
        Revez5 re5 = new Revez5();
        sorteRevez.add(re5);
        Revez6 re6 = new Revez6();
        sorteRevez.add(re6);

        Sorte so0 = new Sorte();
        sorteRevez.add(so0);
        Sorte1 so1 = new Sorte1();
        sorteRevez.add(so1);
        Sorte2 so2 = new Sorte2();
        sorteRevez.add(so2);
        Sorte3 so3 = new Sorte3();
        sorteRevez.add(so3);
        Sorte4 so4 = new Sorte4();
        sorteRevez.add(so4);
        Sorte5 so5 = new Sorte5();
        sorteRevez.add(so5);;
        Sorte6 so6 = new Sorte6();
        sorteRevez.add(so6);
        Sorte7 so7 = new Sorte7();
        sorteRevez.add(so7);
    }

}