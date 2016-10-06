
public class Asctochar {
	public static void main(String arg[])
	{
		//System.out.println(Character.toChars(65)) ;
		for (int i=65;i<=90;i++)
		{
		
		//System.out.println(Character.toString(Character.toChars(i))); i wanted to print in single line but icould not
			System.out.print(i + "-"); //printing UNICODE and -
			System.out.println(Character.toChars(i)); //printing char value of unicode
			
		}
	}
}
