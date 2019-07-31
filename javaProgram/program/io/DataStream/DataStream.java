import java.io.*;

class DataStream
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream din=new DataInputStream(System.in);
		//DataInputStream is connected to the buffer of keyboard
		FileOutputStream fout=new FileOutputStream("abc4.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		//PrintStream pout=new PrintStream(fout);
		String s=" ";
			while(!s.equals("stop"))
			{
				s=din.readLine();
				System.out.println(s);
				dout.writeChars(s);
				//dout.writeUTF(s);
				//dout.writeBytes(s);
/*all the above three methods left the new line character into the buffer that's why we use flush; if we don't use flush then all the content will be written into a single line */
				//pout.println(s); //it does not left the new line character into buffer
				dout.flush();
				//This method forces bytes to be written to the underlying stream
			}
		din.close();
	}
}
