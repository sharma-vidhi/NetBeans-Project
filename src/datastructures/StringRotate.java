
public class StringRotate {
public static boolean isSubString(String big,String small) {
	if(big.indexOf(small)>0) {
		return true;
	}
	return false;
}
public static boolean isRotate(String s1,String s2) {
	int len=s1.length();
	if(len == s2.length() && len>0) {
		String s1s1=s1+s1;
		return isSubString(s1s1,s2);
	}
	return false;
}

public static void main(String args[]) {
	String [][] pairs = {{"apple","paple"},{"table","ablet"}};
	for(String pair[]:pairs) {
		String word1=pair[0];
		String word2 =pair[1];
		boolean isrotate=isRotate(word1,word2);
		System.out.println(word1+"\t"+word2+"\t"+isrotate);
	}
}
}
