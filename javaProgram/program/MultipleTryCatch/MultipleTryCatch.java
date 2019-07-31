class MultipleTryCatch{
	public static void main(String s[]){
		try{
			int x= 10/s.length;
			System.out.println(x);
		}catch(ArithmeticException	e){
			System.out.println(e);
		}
		try{
			int z[] =new int[s.length];
			z[3] = 100;
			
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println(ex);
		}
		
	}
}