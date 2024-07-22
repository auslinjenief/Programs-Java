public class StringClass_methods {
	public static void main(String[] args) {
		 /*
		   length(), indexOf(), charAt(), toLowerCase(), toUpperCase(), contains(),
		   lastInderOf(), concat(), compareTo(), trim(), replace(), substring()/subSequence()
		   equals(), equalsIgnoreCase(), valueOf(), strip(),   
		  */
		String s = "Hello";
		System.out.println(s.length());
//		System.out.println(s.indent(2));
		String s1 = "hiiman";
		System.out.println(s1.indexOf('i'));
		System.out.println(s1.lastIndexOf('i'));
		System.out.println(s1.charAt(3));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.contains("n"));
		
//		s = s.concat(" world");
		s  = s + "world";
		System.out.println(s);
		
		//compareTo()
		String s2 = "iello";
		String s3 = "hello";
		System.out.println(s2.compareTo(s3));
		
		
		String s4 = "    hellodoggy    ";//remove space around the sentences
		s4 = s4.trim();
		System.out.println(s4);
		
		String s5 = "hii hello welcome     ";
		s5 = s5.strip();// remove extra space from the last
		System.out.println(s5);
		
		s5 = s5.replace("hii", "Hey");
		System.out.println(s5);
		
		String s6 = "singam";
		System.out.println(s6.substring(0));
		System.out.println(s6.substring(0,3));
		System.out.println(s6.subSequence(0,5));
		
		String s7 = "abcd";
		String s8 = "ABCD";
		System.out.println(s7.equals(s8));
		System.out.println(s7.equalsIgnoreCase(s8));
		//split()
		String s9 = "hii-hello-welcome-to-the-show";
		String a[] = s9.split("-");
		for(String ans : a)
		{
			System.out.println(ans);
		}
		
		//valueOf()
		String str = "abcd";
	    char ch[] = str.toCharArray();
	    for(char c : ch)
	    {
	    	System.out.println(c);
	    }
	    String val = String.valueOf(ch);
	    System.out.println(val);
		
		
	}

}
