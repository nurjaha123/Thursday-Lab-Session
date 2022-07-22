class SumOfDigits
{
	
	public static void main(String[] args){
		int i = 234;
		int num = i;
		int sum = 0;
		int rem = 0;

		while (i != 0){
			rem = i%10;
			sum = sum + rem;
			i= i/10;
		}
		System.out.println("given number" +num);
		System.out.println(" sum of given number is" + sum);
	}
} 
