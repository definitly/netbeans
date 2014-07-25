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

public class GetDistance {

  //вычесление длины большого круга
    
  static public double getDist(double lat1 , double lon1 , double lat2 , double lon2) {
    
     double rlat2=Math.toRadians(lat2);	
        double rlat1=Math.toRadians(lat1);
        double rlon1=Math.toRadians(lon1);
        double rlon2=Math.toRadians(lon2);
      
        
         return (int) ( (Math.atan2(Math.sqrt(Math.pow(Math.cos(rlat2)*Math.sin(rlon2-rlon1),2)+
               Math.pow(Math.cos(rlat1)* Math.sin(rlat2)-Math.sin(rlat1)*Math.cos(rlat2)*Math.cos(rlon2-rlon1),2)),
               Math.sin(rlat1)*Math.sin(rlat2)+Math.cos(rlat1)*Math.cos(rlat2)*Math.cos(rlon2-rlon1))*6372795)/1000); //в км
}
    
   static public double getAzimut (double lat1, double lon1 ,double lat2 , double lon2 ) {

     double rlat2=Math.toRadians(lat2);	
       double rlat1=Math.toRadians(lat1);
       double rlon1=Math.toRadians(lon1);
        double rlon2=Math.toRadians(lon2);
       

 
   return (int) Math.toDegrees(Math.atan2(Math.sin(rlon2-rlon1)*Math.cos(rlat2),
         Math.cos(rlat1)*Math.sin(rlat2) - Math.sin(rlat1)*Math.cos(rlat2)*Math.cos(rlon2-rlon1)
         ) );
       }
 
 
     static public double DesPoint (double lat1 , double lon1 , int d , double b)
 
 {

     double rlat1=Math.toRadians(lat1);
     double rlon1=Math.toRadians(lon1);
     
     double dist = 150.0/6372.0;
     double brng = Math.toRadians(b);
    

     double lat2 = Math.asin( Math.sin(rlat1)*Math.cos(dist) + Math.cos(rlat1)*Math.sin(dist)*Math.cos(brng) );
     double a = Math.atan2(Math.sin(brng)*Math.sin(dist)*Math.cos(rlat1), Math.cos(dist)-Math.sin(rlat1)*Math.sin(lat2));
     System.out.println("a = " + a);
     double lon2 = rlon1 + a;

     lon2 = (lon2+ 3*Math.PI) % (2*Math.PI) - Math.PI;

     System.out.println("Latitude = "+Math.toDegrees(lat2)+"\nLongitude = "+Math.toDegrees(lon2));
    
 return 1;

 }

}