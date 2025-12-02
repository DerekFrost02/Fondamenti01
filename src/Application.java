
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {5, -4, 0, 12, 40, 6};
		
		boolean checkZeri = false;
		for(int i = 0; i< number.length; i++)
		{
			if(number[i] == 0)
			{
				checkZeri = true;
			}
		}
		
		if(checkZeri) 
		{
			System.out.println("l'array contiene zeri");
		}
		else
		{
			System.out.println("l'array contiene zeri");
		}
	}

}
