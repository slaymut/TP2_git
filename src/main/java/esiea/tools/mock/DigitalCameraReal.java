package esiea.tools.mock;

import java.awt.Image;
import java.awt.image.BufferedImage;
/* UNCOMMENT THIS CLASS WHEN WORKING ON THE CORRESPONDING EXERCISE */

public class DigitalCameraReal implements IDigitalCamera {

	private  boolean flashOn = false;
	@Override
	public Image takeSnapshot() {
		Image image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
		return image;
	}

	@Override
	public void flashLightOn() {
		// TODO This would connect to the real camera and set the flash light on
		flashOn = true;

	}

	@Override
	public void flashLightOff() {
		// TODO This would connect to the real camera and set the flash light off
		flashOn = false;
	}

}