/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo4;

/**
 *
 * @author LucasBohórquezNaranj
 */
public class NoThread {
    
    private int theCounter = 0;
    private int theID = 0;
    private OnChange theDelegate = null;
    
    public NoThread(int newID, OnChange newDelegate){
        theID = newID;
        theDelegate = newDelegate;
    }
    
    public void start(){
        run();
    }
    
    public void run(){
        for (int i = 0; i < 20_000_000; i++) {
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
