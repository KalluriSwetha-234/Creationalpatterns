package design.pattern;
import com.phone.Phone;
import com.phone.Phonebuilder;
//builder pattern

public class Builderpattern {
	public static void main(String args[]) {
	Phone p=new Phonebuilder().setOs("Android").setRam(4).getPhone();
	System.out.println(p);
	}
}
