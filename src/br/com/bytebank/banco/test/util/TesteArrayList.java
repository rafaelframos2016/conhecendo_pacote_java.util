package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
    public static void main(String[] args) {

        //List<Conta> lista = new ArrayList<Conta>(); //usa array por baixo
        List<Conta> lista = new LinkedList<Conta>(); //lista linkada
        //Collection<Conta> lista = new Vector<Conta>();

        Conta cc1 = new ContaCorrente(22, 22);
        Conta cc2 = new ContaCorrente(22, 22);
        
        lista.add(cc1);
        
        boolean existe = lista.contains(cc2); //novo

        System.out.println("Já existe? " + existe);
        
        Conta ref = lista.get(0); //não compila

        for(Conta cc: lista) {
            System.out.println(cc);
        }

    }
}
