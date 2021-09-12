/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LucasBohórquezNaranj
 */
public class Main2 {
        
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args){
        long ini = 0;
        long fin = 0;
        long dif = 0;
        
        final int MAX_TASKS = 8;
        
        MyTask[] tasks = new MyTask[MAX_TASKS];
        
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new MyTask(i + 1, null);          
        }
        
        ini = System.currentTimeMillis();
        
        for (MyTask task : tasks) {
            task.start();
        }
        
        for (MyTask task : tasks) {
            try {
                task.getThread().join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        fin = System.currentTimeMillis();
        
        dif = (fin - ini);
        
        System.out.println("#Threads: " + tasks.length + " TimeLapse: " + (dif / 1_000f));
    }
}
