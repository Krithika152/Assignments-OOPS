package org.system;

public class Desktop extends Computer {
public void desktopSize(int a)
{
System.out.println(a);
}

public static void main(String args[])
{
	Desktop desk = new Desktop();
	desk.computerModel();
	desk.desktopSize(10);
}
}
