package a5_constructor;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

 class ParameterizedConstractor {
public static void main(String[] args) {

	Std std1=new Std(2,"Handy");
	Std std2=new Std(10,"Justin");
	std1.display();
	std2.display();
		}
}