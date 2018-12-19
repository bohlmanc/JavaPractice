public class Binary {

	public int number;

	public Binary() {
		number = 0;
	}
	
	public int getBinary(String num) {

		int length = num.length();

		if(num.length() == 1) {
			if(num.equals("1")) {
				number++;
			}
			return number;
		}

		if(num.substring(0,1).equals("1")) {
			number = number + (int) Math.pow(2,length-1);
		}

		return getBinary(num.substring(1,length));
	}


	public static void main(String[] args) {
		String binaryNumber = args[0];

		Binary num = new Binary();

		System.out.println(num.getBinary(binaryNumber));

	}
}