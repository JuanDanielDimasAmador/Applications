/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelAreas;
import views.ViewAreas;
import jdda.Validation;
/**
 *
 * @author Migue
 */
public class ControllerAreas implements ActionListener{
    private ViewAreas view;
    private ModelAreas model; 
    Validation VL = new Validation();
    
    public ControllerAreas(ModelAreas model, ViewAreas view) {
        this.model = model;
        this.view = view;

        this.view.jBtn_Calculate.addActionListener(this);
        this.view.jRB_Square.addActionListener(this);
         
    }

    public void init_View() {
        this.view.setVisible(true);
    }
     
    public void actionPerformed(ActionEvent e) {
        if (view.jRB_Square.isSelected()) {
            if (e.getSource() == view.jBtn_Calculate) {
                Square();
            }
        } else if (view.jRB_Rectangle.isSelected()) {
            if (e.getSource() == view.jBtn_Calculate) {
                Rectangle();
            }
        } else if (view.jRB_Triangle.isSelected()) {
            if (e.getSource() == view.jBtn_Calculate) {
                Triangle();
            }
        }
    }

    public void Square() {
        model.setLado(Double.parseDouble(view.jtf_lado.getText())); 
        double area= this.model.getLado()* this.model.getLado();
        this.view.jtf_area.setText("" + area);
    }

    public void Rectangle() {
        model.setBase(Double.parseDouble(view.jtf_base.getText()));
        model.setAltura(Double.parseDouble(view.jtf_Altura.getText()));
        double Area = this.model.getBase() * this.model.getAltura();
        this.view.jtf_area.setText("" + Area);
    }

    public void Triangle() {
        model.setBase(Double.parseDouble(view.jtf_base.getText()));
        model.setAltura(Double.parseDouble(view.jtf_Altura.getText()));
        double Area = this.model.getBase() * this.model.getAltura()/2;
        this.view.jtf_area.setText("" + Area);
    }

    
}