package JavaLearning;



public class CountofeachCharacterintheString   {

	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		String s = "vengatram ";
//System.out.println("Size of string= "+s.length());
		int count=0;
		for(int i=0;i<=s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
			count++;
			
			}
			
		}
		System.out.println(count);
	}
	
}
