import java.io.IOException;
/**
 * 
 * @author sujithadhamotharan
 *
 */
public class IoException {
/**
 * 
 * @throws IOException
 *  in meth() method it throws io exception with IOException error message
 */
	public static void meth() throws IOException {
	    throw new IOException("IOException error message");
	}

	public static void main(String[] args) {
	    try {
	        meth();
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	}

}
