import java.io.*;
class MyFileRead{
	public static void main(String args[]) throws IOException {
		//FileInputStream fr= new  FileInputStream("abc.txt"); // read mode
		FileInputStream fr= new  FileInputStream("D:\\java\\program\\ioFiles\\abc.txt"); // read mode
		
		int i=0;
		while((i=fr.read())!=-1)
			System.out.print((char)i)	 ;
		fr.close();
	}
}