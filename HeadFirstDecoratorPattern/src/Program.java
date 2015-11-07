public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f1 = new Noodle();
		
		//Decorate use egg
		f1 = new Egg(f1);
		
		//Decorate use tomato
		f1 = new Tomato(f1);
		
		//New food rice
		Food rice = new Rice();
		
		//Decorate use Chicken
		rice = new Chicken(rice);
		
		System.out.println(f1.GetDescription() + "\t" + "$" + f1.Cost());
		
		System.out.println(rice.GetDescription() + "\t" + "$" +rice.Cost());
	}

}
