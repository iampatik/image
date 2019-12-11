/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdata;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tancincoja_sd2082
 */
public class BigData implements Runnable{
    
    private int y;


    @Override
    public void run(){
        for(int i = 1;;i++){
            if(i==61){
                i = 1;
            }
            this.setY(i);
            System.out.println("I is: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BigData.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int i) {
        this.y = y;
    }
    
    
    


    
}
