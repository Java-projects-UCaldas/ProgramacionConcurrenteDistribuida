/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo8.nosync;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LucasBohórquezNaranj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Adder adder = new Adder(list, 0);
        Remover remover1 = new Remover(list, 0);
        Remover remover2 = new Remover(list, 0);
        Remover remover3 = new Remover(list, 0);
        
        adder.start();
        remover1.start();
        remover2.start();
        //remover3.start();
    }
    
}
