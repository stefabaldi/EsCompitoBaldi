/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.escompitobaldi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Semaforo 
{
    int valore;
    
    public Semaforo(int v)
    {
        this.valore=valore;
        
    }
    
    synchronized public void P() //metodo che permette di occupare un posto dal thread
    {
        while(valore==0)
        {
            
                {try {
                    
                    wait();
                } 
                
                catch (InterruptedException ex) {
                    Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
                }
}
        
        }
        
    valore--;
    
    
    }
    
    synchronized public void V()  //Metodo che permette al semaforo di liberare un posto dal thread
            
    {
          
            
        notify();
        valore++;
        
        
    
    }
    

    
}
