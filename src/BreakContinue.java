
public class BreakContinue {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==3)
				continue;
			if(i==9)
				break;
			System.out.println(i);
		}
	}

}
