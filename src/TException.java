
public class TException {

	public static void main(String[] args) {
		System.out.println("Go 1:");	
		Thread t = new Thread (new Runnable(){

			@Override
			public void run() {
				System.out.println("run 1");
				int z =1/0;
			
				
				
				
			}}  );
	
	
		try{
			t.start();
		}catch(Exception e){
			System.out.println("Err:"+e);	
		}
		
		Thread z = new Thread (()->{}); //using lamdas	
		
		
		
	}	
}
