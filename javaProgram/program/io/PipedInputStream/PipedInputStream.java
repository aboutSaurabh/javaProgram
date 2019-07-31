import java.io.*;
class Prun
{
	public static void  main(String args[])
	{
		//try(FileOutputStream fw=new FileOutputStream("lalu.txt");FileInputStream fr=new FileInputStream("lalu.txt"))
		try(FileOutputStream fw=new FileOutputStream("abc.txt"); FileInputStream fr=new FileInputStream("abc.txt")){
			String s = "Saurabh singh";
			byte ch[] = s.getBytes();
			int i=0;
			for(i=0; i<ch.length;i++)
				fw.write(ch[i]);
			System.out.println("File create successfully.");
			int j = 0;
			while((j=fr.read())!=-1)
				System.out.println((char)j);
			
		}catch(Exception e){
			System.out.println("Exception block");
		}finally{
			 System.out.println("This is finally block.");
		}
	
		
	}
}





























// import java.io.*;

// class Poutput implements Runnable
// {
	// PipedOutputStream pout;

	// Poutput(PipedOutputStream pout)
	// {
		// this.pout=pout;
	// }
	
	// public void run()
	// {
		// for(int i=65;i<=91;i++)
		// {
			// try
			// {
				// pout.write(i);
				// Thread.sleep(1000);
			// }catch(Exception e){}
		// }
	// }
// }

// class Pinput implements Runnable
// {
	// PipedInputStream pin;
	
	// Pinput(PipedInputStream pin)
	// {
		// this.pin=pin;
	// }

	// public void run()
	// {
		// int z=0;
		// for(int i=65;i<=91;i++)
		// {
			// try
			// {
				// z=pin.read();
			// }catch(Exception e){}
			// System.out.println((char)z);
		// }
	// }
// }

// class Prun
// {
	// public static void main(String args[]) 
	// {
		// try{
			// PipedOutputStream pout=new PipedOutputStream();
			// PipedInputStream pin=new PipedInputStream();
			// pout.connect(pin);
		
			// Poutput po=new Poutput(pout);  //first thread – object of PipedOutputStream is given
			// Pinput pi=new Pinput(pin);	//second thread – objet of PipedInputStream is given

			// Thread t1=new Thread(po);
			// Thread t2=new Thread(pi);
		
			// t1.start();
			// t2.start();
		// }catch(Exception e){
			// System.out.println("");
		// }
	// }
// }
