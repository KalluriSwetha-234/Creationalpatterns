package com.abstractfactory;
import com.computer.Computer;
import com.computer.Pc;

public class PcFactory implements Computerabstractfactory{
	private String ram;
	private String hdd;
	private String cpu;
	
	public PcFactory(String ram, String hdd, String cpu) {
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	public Computer createComputer() {
		return new Pc(ram,hdd,cpu);
	}

}
