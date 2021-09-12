/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo8.sync;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LucasBohórquezNaranj
 */
public class Remover implements Runnable {

    private Thread theThread = null;
    private boolean isRunning = false;
    private int theDelay = 0;
    private List<Integer> theList = null;

    public Remover(List<Integer> newList, int newDelay) {
        theList = newList;
        theDelay = newDelay;
    }

    public Thread start() {
        if (theThread == null) {
            theThread = new Thread(this);
            theThread.start();
        }

        return theThread;
    }

    public void stop() {
        isRunning = false;
    }

    @Override
    public void run() {
        isRunning = true;

        while (isRunning) {
            synchronized (theList) {
                if (!theList.isEmpty()) {
                    theList.remove(theList.size() - 1);
                }
               /* synchronized (System.out) {
                    System.out.println();
                }*/
            }

            try {
                Thread.sleep(theDelay);
            } catch (InterruptedException ex) {
                Logger.getLogger(Adder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
