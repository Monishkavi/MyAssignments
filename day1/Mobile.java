package week1.day1;

public class Mobile {
	
	String  makeCall(String mobileModel,  float mobileWeight)
	{
	return mobileModel + " " +mobileWeight;	
	}
	
	public void sndMsg( boolean isFullCharged, int m)
	{
		System.out.println(isFullCharged+ " "+m);
	}
	
	public static void main(String[] args) {
		Mobile m= new Mobile();
		System.out.println(m.makeCall("samsung",234.5f));
		m.sndMsg (false , 2527);
	}

}
