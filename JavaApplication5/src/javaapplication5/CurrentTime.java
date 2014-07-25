/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication5;

/**
 *
 * @author definitly
 */
public class CurrentTime extends Thread  {
     
     private  static long time;
     private  static long totaltime;
     private static  float travelleddist;
     @Override
     public void run()  {
         time=System.currentTimeMillis();
         
         while (true) {
          double currtime= System.currentTimeMillis();
          try {
    Thread.sleep(1000);
} catch (InterruptedException e) {
 
    Thread.currentThread().interrupt();
}
    	
        currtime =System.currentTimeMillis()-currtime;
    	totaltime=System.currentTimeMillis()-time;
    	travelleddist=(float)TravelledDist.travelledD(950, (currtime/1000)/3600);
    	
         }
    
     }
  
     public long getTime() {
         
         return (totaltime/1000);
     }
     
     public float getTravelledD() {
         
         return travelleddist;
     }
     
     
}
