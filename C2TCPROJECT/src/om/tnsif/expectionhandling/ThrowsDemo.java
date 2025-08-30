package om.tnsif.expectionhandling;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentInfo s = new StudentInfo();
s.setName("Apoorva");
s.setRollNum(403);
s.setPerc(98.8f);

s.show();

Voterinfo v1 = new Voterinfo();
v1.setName("Ramu");
v1.setAge(19);
System.out.println(v1);
	}

}
