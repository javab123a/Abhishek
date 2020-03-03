package string;

public class palendromeusingstringbuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new
				StringBuffer("ABCDEF");
		System.out.println("buffer sb1 contents before reverse:"+sb1);
		StringBuffer sb2=sb1.reverse();
		System.out.println("buffer sb1 contents after reverse "+sb1);
		System.out.println("returned StringBuffer sb2 content:"+sb2);
				
	}

}
