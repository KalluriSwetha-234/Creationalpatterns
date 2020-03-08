package com.abstractfactory;
import com.computer.Computer;

public class ComputerFactory {
	public static Computer getComputer(Computerabstractfactory factory){
		return factory.createComputer();
	}
}
