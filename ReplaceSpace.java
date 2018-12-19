public class ReplaceSpace {

	public static void main(String[] args) {
		String s = args[0];
		System.out.println(replaceSpace(s));
	}

	public static String replaceSpace(String s) {

		String[] splitString = s.split(" ");
		if(splitString.length == 1) {
			if(s.indexOf(" ") != -1) {
				return "%s";
			}
			return s;
		}

		String newString = "";
		for(int i = 0;i<splitString.length;i++) {
			newString = newString + splitString[i];
			if(i < splitString.length-1) {
				newString = newString + "%20";
			}
		}

		return newString;
	}
}