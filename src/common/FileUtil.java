package common;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileUtil {
	private String fileName;
	public FileUtil(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * serialize a List
	 * @param l Data List
	 * @return false if error
	 */
	public boolean serialize(List l){
		try {
			FileOutputStream fo = new FileOutputStream(fileName);
			ObjectOutputStream so = new ObjectOutputStream(fo);
			so.writeObject(l);
			return true;
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return false;
	}
	/**
	 * deserialize a List
	 * @return null if an error
	 */
	public List deserialize(){
		List l = null;
		try {
			FileInputStream fi = new FileInputStream(fileName);
			ObjectInputStream si = new ObjectInputStream(fi);
			l = (List) si.readObject();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return l;
	}
}