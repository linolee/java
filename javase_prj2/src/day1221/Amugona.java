package day1221;

public class Amugona {
	public static void main(String[] args) {
		String s = "c:/dev/temp/java_read.txt";
		System.out.println(s);
		StringBuilder sb = new StringBuilder(s); 
		System.out.println(sb.insert(s.lastIndexOf("."), "_bak"));
		
	}
}
