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
public class TravelledDist {
    public static int speed;
    public static float dist;
    public static float totaldist;
    
    public static double travelledD (int speed,double time){
        dist= (float)time*speed;
        totaldist=totaldist+dist;
        return totaldist;
    }
    
}
