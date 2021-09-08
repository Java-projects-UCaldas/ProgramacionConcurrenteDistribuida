/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo1;

/**
 *
 * @author LucasBohórquezNaranj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NoThread t1 = null;
        NoThread t2 = null;
        NoThread t3 = null;
        NoThread.OnChange delegate = null;
        
        /*
        delegate = (id,  value) -> {
            System.out.println("Task: " +  id + " = " + value);
        };
        
        t1 = new NoThread(1, delegate);
        t2 = new NoThread(2, delegate);
        t3 = new NoThread(3, delegate);
        
        delegate = (int value) -> {
            System.out.println("Counter: " + value);
        };
        
        
        delegate = new NoThread.OnChange() {
            @Override
            public void show(int value) {
                System.out.println("Counter: " + value);
            }
        };*/
        
        t1 = new NoThread(1, (id, value) -> {
            System.out.println("Task: " +  id + " = " + value);
        });
        
        t2 = new NoThread(2, (id, value) -> {
            System.out.println("Task: " +  id + " = " + value);
        });
                
        t3 = new NoThread(3, (id, value) -> {
            System.out.println("Task: " +  id + " = " + value);
        });
        
        System.out.println("Start 1");
        t1.start();
        System.out.println("Start 2");
        t2.start();
        System.out.println("Start 3");
        t3.start();
        System.out.println("End");
        
        
    }
    
}
