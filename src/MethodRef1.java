import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodRef1 {

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.println("name:"+s); 
		
		List<String> ls = Arrays.asList("xyz", "abc");
		
		ls.forEach(c);
		
		
	}
}
