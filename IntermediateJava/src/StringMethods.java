
public class StringMethods {
public static void main (String args[]) {
	String[] words ={"krishna","kc","chaitanya"};
	for(String k: words){
	if (k.startsWith("k"))
		System.out.println(k+" Starts with k");
}
	System.out.println("");
	
	for(String a: words){
	if (a.endsWith("a"))
		System.out.println(a+" Starts with a");
	}
}
}
