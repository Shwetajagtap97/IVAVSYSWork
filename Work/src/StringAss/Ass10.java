package StringAss;

public class Ass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Red is my favortie color";
		String[] s=str.split(" ");
		String str2="Orange is fruit";
		String[] s1=str2.split(" ");
		if(s[0].equalsIgnoreCase("red"))
			System.out.println("True");
		else
			System.out.println("Flase");

	}

}
