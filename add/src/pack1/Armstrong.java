package pack1;

public class Armstrong {
	public static void main(String[] args) 
	{
		int number = 131, originalNumber, remainder, result = 0;
		originalNumber = number;
		while (originalNumber != 0)
		{
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}
		if(result == number)
			System.out.println(number + " is an Armstrongnumber.");
		else
			System.out.println(number + " is not an Armstrongnumber.");
		}


}
