import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamMethodRef {

	
	
		
		String name;
		double price ;
		StreamMethodRef (String name,double price){

			this.name=name;
			this.price=price ;
		}
		
		public String getName(){
			return name;
		}
		
		public double getPrice(){
			return price;
		}

		public String getNamePrice(){
			return "name: "+name+" : "+ price;
		}
	
		
		public static String getNames(){
			return "test";
		}
		
	
	
	
	
	public static void main(String[] args) {
	
		ArrayList<StreamMethodRef> arr = new ArrayList<>();
		arr.add(new StreamMethodRef("Apple",2.0 ) );
		arr.add(new StreamMethodRef("Pear",1.0 ) );
		arr.add(new StreamMethodRef("Banana",0.5 ) );
		arr.add(new StreamMethodRef("Grape",3.0 ) );
		
		
		String listToString = arr.stream().map(StreamMethodRef::getName)// - this can access by instance as it need object.
		  .collect(Collectors.joining(", ", "[", "]"));

		System.out.println( "result :" +listToString );
		
		
		
		
	}

}
