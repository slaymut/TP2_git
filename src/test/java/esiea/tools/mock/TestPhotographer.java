package esiea.tools.mock;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;
/* UNCOMMENT THIS CLASS WHEN WORKING ON THE CORRESPONDING EXERCISE */

class TestPhotographer {

	@Test
	void testTakePictureWithoutFlash() {
		System.out.println("testing the camera without flash");
		DigitalPhotographer dp = new DigitalPhotographer();
		IDigitalCamera dc = new DigitalCameraMock();
		dp.setDigitalCamera(dc);
		BufferedImage img = (BufferedImage) dp.takePictureWithoutFlash();
		assertNotNull(img);  //other tests may be made here on the image...
		assertEquals(200, img.getWidth());
		try {
			ImageIO.write(img, "jpg", new File("resources\\outputWithoutFlash.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testTakePictureWithFlash() {
		System.out.println("testing the camera with flash");
		DigitalPhotographer dp = new DigitalPhotographer();
		IDigitalCamera dc = new DigitalCameraMock();
		dp.setDigitalCamera(dc);
		BufferedImage img = (BufferedImage) dp.takePictureWithFlash();

		assertNotNull(img);
		assertEquals(200, img.getHeight());

		try {
			ImageIO.write(img, "jpg", new File("resources\\outputWithoutFlash.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
