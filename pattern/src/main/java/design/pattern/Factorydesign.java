package design.pattern;
import com.phone.Os;
import com.phone.Android;
import com.phone.Ios;
import com.phone.Windows;
import com.phone.Operatingsysfact;

public class Factorydesign {
	public static void main(String args[])
	{
		Operatingsysfact  osf=new Operatingsysfact ();
	    Os obj=osf.getInstance("Open");
	    obj.specific();
	}


}
