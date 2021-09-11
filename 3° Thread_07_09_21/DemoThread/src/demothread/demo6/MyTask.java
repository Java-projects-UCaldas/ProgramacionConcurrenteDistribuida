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
public class MyTask implements Runnable{

    private Thread theThread = null;
    private int theID = 0;
    private OnChange theDelegate = null;
    private long theTimeLapse = -1;
    
    public MyTask(int newID, OnChange newDelegate){
        theID = newID;
        theDelegate = newDelegate;
        theThread = new Thread(this);
    }
    
    public Thread start(){
        if(getThread() == null){
            theThread = new Thread(this);
            getThread().start();
        }
        getThread().start();
        
        return getThread();
    }

    /**
     * @return the theThread
     */
    public Thread getThread() {
        return theThread;
    }

    /**
     * @return the theID
     */
    public int getID() {
        return theID;
    }

    /**
     * @return the theTimeLapse
     */
    public long getTimeLapse() {
        return theTimeLapse;
    }
    
    public boolean isPrime(int num){
        final int UPPER_LIMIT = (num - 1);
        boolean isPrime = false;
        int divCounter = 2;
        
        if (num > 1){
            for (int i = 2; i <= UPPER_LIMIT; i++) {
                if (num % i == 0){
                    divCounter ++;
                }
            }
            isPrime = (divCounter == 2);
        }
        return isPrime;
    }
    
    @Override
    public void run(){
        long ini = 0;
        long fin = 0;
        long dif = 0;
        
        ini = System.currentTimeMillis();
        
        isPrime(2_147_483_629);
        
        fin = System.currentTimeMillis();
        
        dif = (fin - ini);
        
        theTimeLapse = dif;
    }
    
    public interface OnChange{
        public abstract void show(int id, int value);
    }
}
