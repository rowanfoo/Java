import java.util.stream.Stream;

public class MyStream {

	public static void main(String[] args) {
		Stream.of("a1", "a2", "a3").forEach(s->{System.out.println(s); }   );
	}

}
