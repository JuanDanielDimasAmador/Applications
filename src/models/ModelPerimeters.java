/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import views.ViewPerimeters;

/**
 *
 * @author PC-19
 */
public class ModelPerimeters {

    ViewPerimeters per = new ViewPerimeters();
    private double side = 0;

    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.side = side;
    }

    
}
