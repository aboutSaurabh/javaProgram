import java.io.*;

class Ps
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fout=new FileOutputStream("abc1.txt");
		PrintStream ps=new PrintStream(fout);
		FileOutputStream fout1=new FileOutputStream("abc2.txt");
		PrintStream ps1=new PrintStream(fout1);
		System.out.println("Before");
		
		PrintStream ps4=System.out;
		
		System.setOut(ps);
		System.setErr(ps1);
		System.out.println("abc 100");
		System.out.println("abc 200");
		System.err.println("abc 300");
		System.err.println("abc 400");
		
		//System.out=ps4;
		
		System.setOut(ps1);
		System.out.println("abc 500");
		System.setOut(ps4);
		ps4.println("After");
		System.out.println("via actual out");
	}
}
