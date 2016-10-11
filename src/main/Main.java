/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.*;
import models.*;
import controllers.*;
import javax.swing.JPanel;

/**
 *
 * @author Danni
 */
public class Main {
    private static ViewMain viewMain;
    private static ModelMain modelMain;
    private static ControllerMain controllerMain;
    
    private static ViewPerimeters viewPerimeters;
    private static ModelPerimeters modelPerimeters;
    private static ControllerPerimeters controllerPerimeters;
    
    private static ViewAreas viewAreas;
    private static ModelAreas modelAreas;
    private static ControllerAreas controllerAreas;
    
    private static ViewVolume viewVolume;
    private static ModelVolume modelVolume;
    private static ControllerVolume controllerVolume;
    
    public static void main (String[] jdda){
        
        viewPerimeters = new ViewPerimeters();
        modelPerimeters = new ModelPerimeters();
        controllerPerimeters = new ControllerPerimeters(modelPerimeters, viewPerimeters);
        
        viewAreas = new ViewAreas();
        modelAreas = new ModelAreas();
        controllerAreas = new ControllerAreas(modelAreas, viewAreas);
        
        viewVolume = new ViewVolume();
        modelVolume = new ModelVolume();
        controllerVolume = new ControllerVolume(modelVolume, viewVolume);
        
        JPanel views[] = new JPanel[3];
        views[0] = viewPerimeters;
        views[1] = viewAreas;
        views[2] = viewVolume;
        
        viewMain = new ViewMain();
        modelMain = new ModelMain();
        controllerMain = new ControllerMain(viewMain, modelMain, views);

    }
    
}
