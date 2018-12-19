public class UniqueString {

	public static void main(String[] args) {
		String testString = args[0];
		System.out.println(uniqueString(testString));
	}

	static boolean uniqueString(String s) {
		int[] charAscii = new int[256];

		if(s.length() == 0 || s.length() == 1) {
			return true;
		}

		for(int i = 0;i<s.length();i++) {
			if(charAscii[s.charAt(i)] == 1) {
				return false;
			}
			charAscii[s.charAt(i)] = 1;
		}
		return true;
	}
}