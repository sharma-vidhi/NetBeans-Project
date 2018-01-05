public class palindrome{
public static boolean ispalindrome(char [] str) {
	int i=0;
	int j=str.length - 1 ;
	while(j>i) {
		if(str[i]!=str[j]) {
			return false;
		}
		i++;
		j--;
	}
	return true;
}
public static void main(String args[]) {
	String str="abccba";
	char [] aa=str.toCharArray();
	System.out.println(ispalindrome(aa));
}
}
