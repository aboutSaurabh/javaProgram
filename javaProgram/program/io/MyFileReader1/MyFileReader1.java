
import java.io.*;
class MyFileReader1{
	public static void main(String args[]) throws IOException {
		//FileInputStream fr= new  FileInputStream("abc.txt"); // read mode
		FileInputStream fr= new  FileInputStream("abc.txt"); // read mode
		byte b[] = new byte[fr.available()];
		fr.read(); // this method reads all the data and put the data into byte type of array
		String s =new String(b);
		System.out.println(s);
		fr.close();
	}
}