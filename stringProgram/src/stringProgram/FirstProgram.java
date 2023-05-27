package stringProgram;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="velocity";
		String s2="mithun";
		String s3="KAREWAD";
		String s4="my name is mithun";
		String s5="";
		System.out.println(s1);
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s4.replace("mithun", "karewad"));
        System.out.println(s5.isEmpty());
        System.out.println(s1.charAt(5));
        System.out.println(s1.length());
        System.out.println(s1.lastIndexOf("i"));
        System.out.println(s4.endsWith("mithun"));
        System.out.println(s1+s2);
        System.out.println(s4.startsWith("my"));
	}

}
