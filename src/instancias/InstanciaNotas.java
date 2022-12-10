package instancias;

import java.util.ArrayList;

import interfaces.INotas;
import notas.Nota1;
import notas.Nota10;
import notas.Nota100;
import notas.Nota5;
import notas.Nota50;
import notas.Nota500;

public class InstanciaNotas {
    public ArrayList<INotas> instanciaNotas(){
        ArrayList<INotas> n = new ArrayList<INotas>();
        Nota1 n1 = new Nota1();
        Nota5 n5 = new Nota5();
        Nota10 n10 = new Nota10();
        Nota50 n50 = new Nota50();
        Nota100 n100 = new Nota100();
        Nota500 n500 = new Nota500();
        n.add(n500);
        n.add(n100);
        n.add(n50);
        n.add(n10);
        n.add(n5);
        n.add(n1);
        return n;
    }
}