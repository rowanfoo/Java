import java.util.ArrayList;
import java.util.Arrays;

public class MyCloseable implements AutoCloseable  {

	
	public void close(){
		System.out.println(" I am closing ");
	}

	
	public void doSomething(){
		System.out.println(" I am doSomething ");
	}

	public void doError()throws Exception {
		throw new Exception("Err");
	}
	
	

	public static void main(String[] args) {

		
		try(MyCloseable cl =  new MyCloseable() ) {
			//cl.doSomething();
			cl.doError();
			
		} catch (Exception e) {
			System.out.println(" I am MyCloseable: "+e);
		}
		
		
	}

	
	
}
