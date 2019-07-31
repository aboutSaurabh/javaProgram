import java.io.*;
class ResourceHandlingViaTryBlock{
	public static void main(String args[]) throws IOException
	{
		try(FileOutputStream fw=new FileOutputStream("D:\\java\\program\\ioFiles\\abc.txt");FileInputStream fr=new FileInputStream("D:\\java\\program\\ioFiles\\abc.txt"))
		{
			String s="India is a good country in this world";
			byte ch[]=s.getBytes();
			for(int i=0;i<ch.length;i++)
				fw.write(ch[i]);
			//fw.write(ch);
			//fw.close();
			System.out.println("file successfully created");
			int i=0;
			while((i=fr.read())!=-1)
				System.out.print((char)i);
		}catch(Exception e){}
	}
 void close(){
	 System.out.println("Resource close");
 }
}