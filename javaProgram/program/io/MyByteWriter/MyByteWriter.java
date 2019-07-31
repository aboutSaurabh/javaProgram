import java.io.*;
class MyByteWriter
{
	public static void main(String args[]) throws IOException
	{
		ByteArrayOutputStream fw=new ByteArrayOutputStream();
		String s="India is a good country. ";
		byte ch[]=s.getBytes();
		for(int i=0;i<ch.length;i++)
			fw.write(ch[i]);
		fw.writeTo(new FileOutputStream("abc.txt"));
		fw.writeTo(new FileOutputStream("abc1.txt"));
/*
Now if you want to get back the data in your program in the form of String, then this class has overridden the toString() method
*/
		System.out.println(fw.toString());
/*
if you want to get back the data in your program into byte type of array then use toByteArray() method of this class
*/
		byte z[]=fw.toByteArray();
/*
Now if you want to read the data from this byte type of array then you will need a class ByteArrayInputStream, while creating the object of this class just pass the array into the constructor
*/
		ByteArrayInputStream fr=new ByteArrayInputStream(z);
		int i=0;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
	}
}
