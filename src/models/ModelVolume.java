/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import jdda.Validation;
/**
 *
 * @author Danni
 */
public class ModelVolume {
    
    Validation val = new Validation();
    
    private float h;
    private float r;

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    
    public float calculateCylinder(){
        return (val.stringToFloat("3.1416")*(r*r))*h;
    }
    
    public float calculateSphere(){
        return (val.stringToFloat("3.1416")*val.stringToFloat(".75"))*(r*r);        
    }
    
    public float calculateCone(){
        return ((val.stringToFloat("3.1416")*(r*r))*h)/3;
    }    
    
}
