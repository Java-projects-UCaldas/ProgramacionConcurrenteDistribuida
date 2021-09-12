/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo6;

/**
 *
 * @author LucasBohórquezNaranj
 */
public class Main1 {
    
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args){
        MyTask task = new MyTask(0, null);
        long totalTimeLapse = 0;
        final int MAX_TASKS = 8;
        
        for (int i = 0; i < MAX_TASKS; i++) {
            task.run();
            totalTimeLapse += task.getTimeLapse();
        }
        
        System.out.println("TimeLapse: " + (totalTimeLapse / 1_000f));
    }
}
