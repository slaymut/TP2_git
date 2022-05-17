package esiea.tools.mock;

import java.awt.*;

public class DigitalPhotographer {
    private IDigitalCamera digitalCamera;

    public DigitalPhotographer() {

    }
    public DigitalPhotographer(IDigitalCamera digitalCamera) {
        this.digitalCamera = digitalCamera;
    }

    public void setDigitalCamera(IDigitalCamera digitalCamera) {
        this.digitalCamera = digitalCamera;
    }

    public Image takePictureWithoutFlash() {
        digitalCamera.flashLightOff();
        return digitalCamera.takeSnapshot();
    }

    public Image takePictureWithFlash() {
        digitalCamera.flashLightOn();
        return digitalCamera.takeSnapshot();
    }
}
