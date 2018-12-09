public class JsRacer{
	public static void main(String[]args){
		System.out.println("HAHHAHAH");
		ClearScreen();
	}

	public static void ClearScreen(){
		try
		{
			final String os = System.getProperty("os.name");
	
			if (os.contains("Windows"))
			{
				Runtime.getRuntime().exec("cls");
			}
			else
			{
				Runtime.getRuntime().exec("clear");
			}
		}
		catch (final Exception e)
		{
			e.printStackTrace();
			System.out.println("Error Happened"); 
		}
	}
}