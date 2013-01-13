/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jcap;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;

/**
 *
 * @author Patricio Pérez Pinto
 */
public class JCap {
    private Rectangle rectangulo;
    private Robot robot;

    public JCap(Rectangle rectangulo) throws AWTException {
        this.rectangulo = rectangulo;
        robot = new Robot();
    }
    
    public BufferedImage getCap(){
        return robot.createScreenCapture(this.rectangulo);
    }

    public Rectangle getRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(Rectangle rectangulo) {
        this.rectangulo = rectangulo;
    }
}
