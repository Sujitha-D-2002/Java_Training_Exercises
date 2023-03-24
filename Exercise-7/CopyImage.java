import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CopyImage {
	public static void main(String args[]) throws Exception {
		/*
		 * Trying to copy image byte to byte.Using ImageIO tring to read and write the
		 * image
		 */
		BufferedImage image = ImageIO.read(new File("sample.jpg"));
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ImageIO.write(image, "jpg", out);
		byte[] data = out.toByteArray();
		ByteArrayInputStream in = new ByteArrayInputStream(data);
		BufferedImage image2 = ImageIO.read(in);
		ImageIO.write(image2, "jpg", new File("copyimage.jpg"));
		System.out.println("image created");
	}
}