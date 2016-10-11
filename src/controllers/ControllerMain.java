/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewMain;
import models.ModelMain;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Danni
 */
public class ControllerMain implements ActionListener {
    
    ViewMain viewMain;
    ModelMain modelMain;
    JPanel views[];
    
    
    public ControllerMain(ViewMain viewMain,ModelMain modelMain,JPanel[] views){

        this.viewMain = viewMain;
        this.views = views;
        this.modelMain = modelMain;
        this.viewMain.jmi_perimeter.addActionListener(this);
        this.viewMain.jmi_area.addActionListener(this);
        this.viewMain.jmi_volume.addActionListener(this);
        
        initView();
  
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== viewMain.jmi_perimeter){
            jmiPerimeterActionPerformed();
        }else if (ae.getSource().equals(viewMain.jmi_area)){
            jmiAreaActionPerformed();
        }else if(ae.getSource().equals(viewMain.jmi_volume)){
            jmiVolumeActionPerformed();
        } 
    }
    
    public void jmiPerimeterActionPerformed(){
        this.viewMain.setContentPane(views[0]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }    
    
    public void jmiAreaActionPerformed(){
        this.viewMain.setContentPane(views[1]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
    public void jmiVolumeActionPerformed(){
        this.viewMain.setContentPane(views[2]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
    
    private void initView(){
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
        this.viewMain.setResizable(false);
    }
    
}
