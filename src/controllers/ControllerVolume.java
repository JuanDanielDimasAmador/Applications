/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelVolume;
import views.ViewVolume;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jdda.Validation;

/**
 *
 * @author Danni
 */
public class ControllerVolume implements ActionListener {
    
    private final ModelVolume modelVolume;
    private final ViewVolume viewVolume;
    Validation val = new Validation();
    String item;
    public ControllerVolume(ModelVolume modelVolume, ViewVolume viewVolume){
        this.modelVolume = modelVolume;
        this.viewVolume = viewVolume;
        
        this.viewVolume.jcb_figures.addActionListener(this);
        this.viewVolume.jbtn_calculate.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(this.viewVolume.jbtn_calculate))
            itemSelected();
    }
    
    public void calculateCylinder(){
        this.modelVolume.setH(val.stringToFloat(this.viewVolume.jtf_height.getText()));
        this.modelVolume.setR(val.stringToFloat(this.viewVolume.jtf_radio.getText()));
        this.viewVolume.jl_result.setText(""+this.modelVolume.calculateCylinder());
    }
    
    public void calculateSphere(){
        this.modelVolume.setH(val.stringToFloat(this.viewVolume.jtf_height.getText()));
        this.modelVolume.setR(val.stringToFloat(this.viewVolume.jtf_radio.getText()));
        this.viewVolume.jl_result.setText(""+this.modelVolume.calculateSphere());
    }
    public void calculateCone(){
        this.modelVolume.setH(val.stringToFloat(this.viewVolume.jtf_height.getText()));
        this.modelVolume.setR(val.stringToFloat(this.viewVolume.jtf_radio.getText()));
        this.viewVolume.jl_result.setText(""+this.modelVolume.calculateCone());
    }
    
    public void itemSelected(){
        item = (String) this.viewVolume.jcb_figures.getSelectedItem();
        if(item.equals("Cilindro"))
            calculateCylinder();
        else if(item.equals("Esfera"))
            calculateSphere();
        else if(item.equals("Cono"))
            calculateCone();
    }
}
