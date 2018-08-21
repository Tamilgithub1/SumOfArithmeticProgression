import java.util.*;
public class te {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int N=in.nextInt();
	int A=in.nextInt();
	int D=in.nextInt();
	int val=(N*(2*A+(N-1)*D)/2);
	System.out.println(val);
}
}
