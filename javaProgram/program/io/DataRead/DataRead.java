import java.io.*;

class DataRead
{
	public static void main(String args[])throws IOException
	{
		DataInputStream din=new DataInputStream(new FileInputStream("abc4.txt"));
		String s=" ";
		while(s!=null)
		{	
			s=din.readLine();
			if(s!=null)
				System.out.println(s);
		}
		din.close();
	}
}
