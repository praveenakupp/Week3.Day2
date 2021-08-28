package Week3.Day2;

public class Desktop implements Hardware,Software
{
	
	public void desktopModel(String n)
	{
		String desktopmodelName = "name";
		System.out.println("Desktop Model is " + desktopmodelName);
	}

	public void softwareResources(int n)
	{
		int count = n;
		System.out.println("Software Resources required:--- " + count);
	}

	public void hardwareResources(int n) 
	{
		int count = n;
		System.out.println("Hardware Resources required:---- " + count);
	}
	
	public static void main(String[] args)
	{
		Desktop obd = new Desktop();
		obd.desktopModel("Dell");
		obd.hardwareResources(21);
		obd.softwareResources(200);		
	}		
	
	public void HardwareResources(int n)
	{
		// TODO Auto-generated method stub
		
	}

}
