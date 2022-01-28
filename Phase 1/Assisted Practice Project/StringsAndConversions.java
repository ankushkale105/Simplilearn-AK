package Assisted_Practice_Project_;

public class StringsAndConversions {

		public static void main(String[] args) {
			//methods of strings
			System.out.println("Methods of Strings");
			
			String sl=new String("Hello World");
			System.out.println(sl.length());

			//substring
			String sub=new String("Welcome To Universe");
			System.out.println(sub.substring(2));

			//String Comparison
			String s1="Hello";
			String s2="World";
			System.out.println(s1.compareTo(s2));

			//IsEmpty
			String s4="";
			System.out.println(s4.isEmpty());

			//toLowerCase
			String s5="Hello";
			System.out.println(s1.toLowerCase());
			
			//replace
			String s6="World";
			String replace=s2.replace('d', 'l');
			System.out.println(replace);

			//equals
			String x="Welcome to the Universe";
			String y="WeLcOmE tO the UniVerse";
			System.out.println(x.equals(y));
	 
			System.out.println("\n");
			System.out.println("Creating StringBuffer");
			//Creating StringBuffer and append method
			StringBuffer s=new StringBuffer("Welcome to Universe!");
			s.append("Life on Earth");
			System.out.println(s);

			//insert method
			s.insert(0, 'w');
			System.out.println(s);

			//replace method
			StringBuffer sb=new StringBuffer("Hello");
			sb.replace(0, 2, "hEl");
			System.out.println(sb);

			//delete method
			sb.delete(0, 1);
			System.out.println(sb);
			
			//StringBuilder
			System.out.println("\n");
			System.out.println("Creating StringBuilder");
			StringBuilder sb1=new StringBuilder("Happy");
			sb1.append("World");
			System.out.println(sb1);

			System.out.println(sb1.delete(0, 1));

			System.out.println(sb1.insert(1, "Welcome"));

			System.out.println(sb1.reverse());
					
			//conversion	
			System.out.println("\n");
			System.out.println("Conversion of Strings to StringBuffer and StringBuilder\n ");
			
			// conversion from String object to StringBuffer 
	        StringBuffer sbr = new StringBuffer(" HELLO WORLD "); 
	        sbr.reverse(); 
	        System.out.println("String to String Buffer");
	        System.out.println(sbr); 
	          
	        // conversion from String object to StringBuilder 
	        StringBuilder sbl = new StringBuilder("BLUE WHALE "); 
	        sbl.append("Aquatic life"); 
	        System.out.println("String to String Builder");
	        System.out.println(sbl);             		
		}
	}