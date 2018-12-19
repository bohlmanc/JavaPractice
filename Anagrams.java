public class Anagrams {
	public static void main(String[] args) {
		String str1 = args[0];
		String str2 = args[1];

		System.out.println(isAnagram(str1,str2));

	}

	public static int[] stringToIntArray(String s) {
		int[] stringIntArr = new int[256];
		for(int i = 0;i<s.length();i++) {
			System.out.println(s.charAt(i));
			stringIntArr[s.charAt(i)] = stringIntArr[s.charAt(i)]+1;
		}
		return stringIntArr;
	}

	public static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}

		int[] stringIntArray1 = stringToIntArray(s1);
		int[] stringIntArray2 = stringToIntArray(s2);

		for(int i : stringIntArray1) {
			System.out.print(i+" ");
		}
		System.out.println("\n+++");
		for(int i : stringIntArray2) {
			System.out.print(i+" ");
		}


		for(int i = 0;i<s1.length();i++) {
			if(stringIntArray1[i] != stringIntArray2[i]) {
				return false;
			}
		}

		return true;
	}


}