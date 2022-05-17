package esiea.tools.mock;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;
/* UNCOMMENT THIS CLASS WHEN WORKING ON THE CORRESPONDING EXERCISE */

class TestDigitalCamera {

	@Test
	public void testTakeSnapshot() {
		IDigitalCamera dc = new DigitalCameraMock();
		BufferedImage img = (BufferedImage) dc.takeSnapshot();
		//Vérifier que ça a bien marcher
		assertNotNull(img);
		try {
			ImageIO.write(img, "jpg", new File("resources\\output.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testFlashLightOn() {
		IDigitalCamera dc = new DigitalCameraMock();
		dc.flashLightOn();

		//assertTrue();
	}

	@Test
	public void testFlashLightOff() {
		IDigitalCamera dc = new DigitalCameraMock();
		dc.flashLightOff();

		//assertTrue();
	}

}
