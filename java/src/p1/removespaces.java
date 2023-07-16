package p1;

public class removespaces {

	public static void main(String[] args) {

		String str = "Shaik Abdul Baji";

		System.out.println(" Before removing spaces :" + str);

		str.replaceAll("//s", " ");

		System.out.println(" After removing spaces :" + str);

	}

}
