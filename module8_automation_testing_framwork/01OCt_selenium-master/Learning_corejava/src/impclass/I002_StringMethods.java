package impclass;

public class I002_StringMethods {
	public static void main(String[] args) {
		
		String str = "Sun rises in East";
		String a = "java";
		String k = "Java";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('r'));
		System.out.println(str.substring(5,11));
		System.out.println(str.replace('i', 'W'));
		System.out.println(a.equals(k));
		System.out.println(a.equalsIgnoreCase(k));
		
		System.out.println("**************************");
		
		String st[] = str.split(" ");
		
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		
		System.out.println("*************************");
		
		char ch[] = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("********************");
		
		byte b[] = str.getBytes();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		
		
	}
}
