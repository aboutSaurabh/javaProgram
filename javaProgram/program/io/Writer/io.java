import java.io.*;
class MyFileWrite{
	
	public static void main(String args[]) throws IOException {
		//FileOutputStream fw= new  FileOutputStream("abc.txt"); // write mode
		//FileOutputStream fw= new  FileOutputStream("abc.txt",true); // Append  mode
		//FileOutputStream fw= new  FileOutputStream(new File("D:\\java\\program\\ioFiles\\abc.txt")); // write  mode
		FileOutputStream fw= new  FileOutputStream(new File("D:\\java\\program\\ioFiles\\abc.txt"),true); // Append  write mode
		
		String s="India is a good country in the world. saurabh singh ";
		// type cast into 
		byte ch[]=s.getBytes();
		for(int i=0;i<ch.length;i++){
			fw.write(ch[i]);
		}
		fw.close();
		System.out.println("File created succesfully");
		
	}
}