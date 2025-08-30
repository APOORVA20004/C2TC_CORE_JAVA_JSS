package om.tnsif.expectionhandling;

public class NestedTryCatch {

	public static void check() {
		String str="TNSIF";
		int slength = str.length();
		System.out.println("The length of the string is "+slength);
		String anotherString = null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException se) {
				System.out.println("index is out of bounds "+se.getMessage());
			}
			System.out.println("the length of the anotherString is :"+anotherString.length());
			
		}
		catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
		}
	}

}

