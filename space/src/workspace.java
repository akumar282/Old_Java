
public class workspace {

	public static void main(String[] args) {
		System.out.println(convertToArray("Burger King"));
		String mess = "Hello "+'\n'+'\n'+"You are receiving this e-mail because you have expressed interest in signing up for a science, math, or computer programming course. Sign-ups for all courses are now open and classes start September 7th. Go ahead and sign up now at www.stem4change.us!" +'\n'+'\n'+ "Stay safe,"+'\n'+"STEM4Change";
		System.out.println(mess);
	}
	public static char[] convertToArray(String str) {
		char[] strarr = new char[str.length()];
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			strarr[i] = c;
		}
		return strarr;
	}

}
