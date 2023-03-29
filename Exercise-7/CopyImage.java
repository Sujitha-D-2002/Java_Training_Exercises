import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CopyImage {
	public static void main(String args[]) throws Exception {
		// Copy image byte to byte.Using ImageIO tring to read and write the image
		BufferedImage image = ImageIO.read(new File("sample.jpg"));
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ImageIO.write(image, "jpg", byteArrayOutputStream);
		byte[] data = byteArrayOutputStream.toByteArray();
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
		BufferedImage image2 = ImageIO.read(byteArrayInputStream);
		ImageIO.write(image2, "jpg", new File("copyimage.jpg"));
		System.out.println("image created");
	}
}