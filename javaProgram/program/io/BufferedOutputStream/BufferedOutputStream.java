import java.io.*;
class BufferedOutputStream 
{ 
	// public static void main(String args[]) throws IOException
	// {
		// FileOutputStream fout = new FileOutputStream("abc");
		// DataOutputStream dout = new DataOutputStream(fout);
		// dout.writeInt(10);
		// dout.writeLong(101);
		// dout.writeBoolean(true);
		// dout.writeDouble(10.9);
		// dout.close();
		
		// FileInputStream fin=new FileInputStream("abc");
		// DataInputStream din=new DataInputStream(fin);
		// int i=din.readInt();
		// long l=din.readLong();
		// boolean b=din.readBoolean();
		// double d=din.readDouble();
	
		// System.out.println(i);
		// System.out.println(l);
		// System.out.println(b);
		// System.out.println(d);

	// }

	public static void main(String ar[]) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("abc.txt");
		PrintStream ps=new PrintStream(fout);
		ps.println("hello");
		ps.println("Hay");
	}
}