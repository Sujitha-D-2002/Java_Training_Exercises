
/**
 * Momento Pattern
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WordDocument {

	public static void main(String[] args) throws Exception {
		/**
		 * Trying to create a file word.dat and write content in that file
		 */
		Word word = new Word();
		System.out.println("The content of word Document:" + word.content);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("word.dat"));
		word.content = "Word Document Content updated";
		oos.writeObject(word);
		/**
		 * Trying to update content in that file(word.dat)
		 */
		word.content = "Word Document Content updated";
		System.out.println("\nThe content of word Document:" + word.content);
		/**
		 * Trying to restore the content(like undo operation)
		 */
		System.out.println("\nAfter Restoring");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("word.dat"));
		word = (Word) ois.readObject();
		System.out.println("Undo content..:" + word.content);
	}

}

class Word implements Serializable {
	String content = "Word Document content....";
}