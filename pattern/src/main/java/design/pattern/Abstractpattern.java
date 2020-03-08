package design.pattern;
import com.abstractfactory.*;
import com.computer.Computer;
public class Abstractpattern 
{
	public static void main(String args[])
	{
		testAbstractFactory();
		
	}
	private static void testAbstractFactory() {
		Computer pc = com.abstractfactory.ComputerFactory.getComputer(new PcFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = com.abstractfactory.ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}
}
