package esiea.tools.mock;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DigitalCameraMock implements IDigitalCamera {
    private boolean flashOn = false;
    @Override
    public Image takeSnapshot() {
        Image image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
        return image;
    }

    @Override
    public void flashLightOn() {
        flashOn = true;
    }

    @Override
    public void flashLightOff() {
        flashOn = false;
    }

    public boolean isFlashOn() {
        return flashOn;
    }
}
