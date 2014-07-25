/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author definitly
 */
public class Aircraft  extends Thread   {
    
private int id;
private int numberofengine;
private String nameofplane;
private int airspeed; //  скорость км в час
private static double ratedtime;// расчетное время в пути
public double fuel;
public static long totaltime; // общее время в пути
public static float dist; // пройденная дистанция за промежуток времени
public static float totaldist; // общая пройденная дистанция

  

public int getid() {
return id;
   }
public void setId(int id) {
this.id = id;
}
public int getNumberofengine() {
return numberofengine;
}
public void setNumberofengine(int numberofengine) {
this.numberofengine = numberofengine;
}
public String getNameofplane() {
return nameofplane;
}
public void setNameofplane(String nameofplane) {
this.nameofplane = nameofplane;
}
public int getAirspeed() {
return airspeed;
}
public void setAirspeed(int airspeed) {
this.airspeed = airspeed;
}


public String getTime ( double dist , int airspeed ) {

    ratedtime=dist/this.airspeed;
    int hours = (int)Math.floor(ratedtime);
    double rawRestMinutes = (ratedtime - hours) * 60;
    int minutes = (int)Math.floor(rawRestMinutes);
    String t=(hours+" часов "+ minutes+" минут");
    return t;

}

//подсчитать дистанцию 
public static double travelledD (int speed,double time){
        dist= (float)time*speed;
        totaldist=totaldist+dist;
        return totaldist;
    }

 public void run(){
     
     
   long  time2=System.currentTimeMillis();
         
          while (true) {
          double currtime= System.currentTimeMillis();
          try {
    Thread.sleep(1000);
} catch (InterruptedException e) {
 
    Thread.currentThread().interrupt();
}
    	currtime =System.currentTimeMillis()-currtime;
    	totaltime=System.currentTimeMillis()-time2;
    	totaldist=(float)travelledD(950, (currtime/1000)/3600);
    	
         }
     
 }

public long getTime() {
return (totaltime/1000);
}
public float getTravelledD() {
return totaldist;
}
}
    

