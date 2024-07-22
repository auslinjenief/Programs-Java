
interface permission
{
	
}
class myclasss //implements permission
{
	public void show()
	{
		System.out.println("In show ...");
	}
}
public class MarkerInterface {
	public static void main(String[] args) {
		myclasss m = new myclasss();
	    if(m instanceof permission)
	    {
	    	m.show();
	    }
	    else
	    {
	    	System.out.println("No access granted");
	    }
	}

}
