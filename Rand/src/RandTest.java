import java.util.*;
public class RandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		int num = gen.nextInt(100) + 1;
		
		System.out.println(num*num);
	}

}
