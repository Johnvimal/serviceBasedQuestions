
public class Test {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		
//		throw new CustomException("helllo");
		
		Bank bank = FactoryMethod.getInstance("axis");
		System.out.println(bank.rate());

	}

}
