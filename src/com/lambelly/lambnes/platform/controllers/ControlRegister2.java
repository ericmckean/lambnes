package com.lambelly.lambnes.platform.controllers;

public class ControlRegister2
{
	private Integer rawControlByte = null;
	public static final int REGISTER_ADDRESS = 0x4017;
	private static ControlRegister2 register = new ControlRegister2();
	
	private ControlRegister2()
	{
	
	}
	
	public void cycle()
	{
		if (this.getRawControlByte() != null)
		{
			this.clear();
		}
	}
	
	private void clear()
	{
		this.setRawControlByte(null);
	}
	
	public void setRegisterValue(int value)
	{
		this.setRawControlByte(value);
	}

	public static ControlRegister2 getRegister()
	{
		return register;
	}

	public static void setRegister(ControlRegister2 register)
	{
		ControlRegister2.register = register;
	}

	private Integer getRawControlByte()
	{
		return rawControlByte;
	}

	private void setRawControlByte(Integer rawControlByte)
	{
		this.rawControlByte = rawControlByte;
	}
	
}
