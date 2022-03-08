package
assignment28;

 class Motherboard {
	
	//static nested class
	static class USB{
		int usb2 = 2;
		int usb3 = 1;
		
		int getTotalPorts() {
			return usb2 + usb3;
		}
		static void disp() {
			System.out.println("we are into static method of the inner class");
		
		}
	}

}
 class Static_Nest_Main {
	public static void main(String[] args)  {
		//create an object of static nested class
		//using the name of the outer class
		Motherboard.USB usb = new Motherboard.USB();
		System.out.println("Total Ports = " + usb.getTotalPorts());
		
		Motherboard.USB.disp();
	}
 }
