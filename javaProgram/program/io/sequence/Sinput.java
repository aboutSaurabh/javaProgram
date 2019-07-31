import java.io.*;
import java.util.*;
class Sinput{
	public static void main(String args[]) throws IOException
	{
		try{
		//SequenceInputStream sin=new SequenceInputStream(new FileInputStream("abc.txt"),new FileInputStream("abc1.txt"));

		SequenceInputStream sin=new SequenceInputStream(new MyEnum());
		DataInputStream din=new DataInputStream(sin);

		String s=" ";
		while(s!=null)
		{
			s=din.readLine();
			if(s!=null)
				System.out.println(s);
		}
		din.close();
		
		}catch(Exception e){
			System.out.println("Exception block");
		}finally{
			System.out.println("Finally block");
		}
	}

}

class MyEnum implements Enumeration
{
	InputStream in[];
	int i=0;

	MyEnum()
	{
		try
		{
		in=new InputStream[]{new FileInputStream("abc.txt"),new FileInputStream("abc1.txt"),
//after creating object of SequenceInputStream using Enumeration object, the hasMoreElements() //method is called automatically and if it returns true then nextElement() method is called //automatically.
			new FileInputStream("abc2.txt")};
		}catch(Exception e){}
	}

	public boolean hasMoreElements()
	{
		if(i<in.length)
			return true;
		else	
			return false;
	}

	public Object nextElement()
	{
		return in[i++];
	}	
}

