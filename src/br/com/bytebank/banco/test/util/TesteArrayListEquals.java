package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>(2);

        Conta cc1 = new ContaCorrente(22, 11);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        boolean igual = cc1.equals(cc2);
        System.out.println(igual); //deve imprimir true

        for(Conta oRef : lista) {
            System.out.println(oRef);
        }

    }
}
