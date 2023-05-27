package stringProgram;

public class sample {

	public static void main(String[] args) {
		String s1="ab";
		s1=s1+"cd";
		s1=s1+"xyz";
		System.out.println(s1);
		String s2="abcd";
		String s3="abcd";
		String s4="abcd1";
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		
		String s5=new String("abcd");
		String s6=new String("abcd");
		System.out.println(s2==s5);
		System.out.println(s5==s6);

	}

}
