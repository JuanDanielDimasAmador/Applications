/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelPerimeters;
import views.ViewPerimeters;

/**
 *
 * @author PC-19
 */
public class ControllerPerimeters implements ActionListener {

    private ViewPerimeters view;
    private ModelPerimeters model;

    public ControllerPerimeters(ModelPerimeters model, ViewPerimeters view) {
        this.model = model;
        this.view = view;

        this.view.jBtn_Calculate.addActionListener(this);
        this.view.jRB_Square.addActionListener(this);

    }

    public void init_View() {
        this.view.setVisible(true);
    }

    @Override
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
        model.setSide(Double.parseDouble(view.jTF_Side.getText()));
        double perimeter = this.model.getSide() * 4;
        this.view.jTF_Perimeter.setText("" + perimeter);
    }

    public void Rectangle() {
        model.setSide(Double.parseDouble(view.jTF_Side.getText()));
        double perimeter = this.model.getSide() * 4;
        this.view.jTF_Perimeter.setText("" + perimeter);
    }

    public void Triangle() {
        model.setSide(Double.parseDouble(view.jTF_Side.getText()));
        double perimeter = this.model.getSide() * 3;
        this.view.jTF_Perimeter.setText("" + perimeter);
    }
}
