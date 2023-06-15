
public class FactoryMethod {
	
	public static Bank  getInstance(String key){
		Bank bank = null ;
		if (key == "icici")
			bank = new Icici();
		else if (key == "axis") 
			bank = new AxisBank();
		return bank;
	}

}
