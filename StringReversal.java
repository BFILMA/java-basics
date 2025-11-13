public class StringReversal
{
	public static void main(String[] args)
	{
		String str = "123";

		System.out.println(reverse(str));
	}

	public static String reverse(String str)
	{
		StringBuilder output = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--)
			output.append(str.charAt(i));

		return output.toString();
	}
}
