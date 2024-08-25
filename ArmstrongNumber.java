package testleafplaygroundquestions;

public class ArmstrongNumber {

	
	public static void main(String[] args) {
		int num = 153;
		System.out.println(num + " is an anagram number: " + isAnagramNumber(num));
	}
	
	public static boolean isAnagramNumber(int num)
	{
		int originalNum = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length(); //check no of digits in a number

        while (num > 0) {
            int digit = num % 10; //find last digit of a number
            int power = 1;
            for (int i = 0; i < numberOfDigits; i++) {
                power *= digit;
            }
            sum += power;
            num /= 10; //remove one digit of a number
        }

        return sum == originalNum;
	}
	
	
}
