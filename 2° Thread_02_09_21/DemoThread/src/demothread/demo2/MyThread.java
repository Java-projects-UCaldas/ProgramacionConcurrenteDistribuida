/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo2;

/**
 *
 * @author LucasBohórquezNaranj
 */
public class MyThread extends Thread{
    
    private int theCounter = 0;
    private int theID = 0;
    private OnChange theDelegate = null;
    
    public MyThread(int newID, OnChange newDelegate){
        theID = newID;
        theDelegate = newDelegate;
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            theCounter ++;
            
            if (theDelegate != null){
                theDelegate.show(theID, theCounter);
            }
        }
    }
    
    public interface OnChange{
        public abstract void show(int id, int value);
    }
}
