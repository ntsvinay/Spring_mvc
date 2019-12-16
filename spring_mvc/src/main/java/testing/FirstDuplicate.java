package testing;

import java.util.HashSet;

public class FirstDuplicate {
	public static void main(String[] args) {
		String text = "hello vinay mohaniya";
		HashSet sh=new HashSet();
		char[] text1 = text.toCharArray();
		for (int i = 0; i < text1.length - 1; i++) {
			if(sh.contains(text1[i]))
			{
				System.out.println(text1[i]);
				break;
			}
			else
			{
				sh.add(text1[i]);
			}
		}
	}
}
