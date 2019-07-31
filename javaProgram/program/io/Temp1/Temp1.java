import java.io.*;
class Temp1
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fout = new FileOutputStream("temp.txt");
		PrintStream ps = new PrintStream(fout);
		
		System.out.println("Hello1");
		System.setOut(ps);
		System.out.println("hi");
	}
}


