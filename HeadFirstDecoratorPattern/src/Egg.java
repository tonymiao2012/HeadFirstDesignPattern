
public class Egg extends Ingredients{
	Food meal;
	public Egg(Food meal){
		
		this.meal = meal;
	}
	@Override
	public double Cost() {
		// TODO Auto-generated method stub
		return 3.0 + meal.Cost();
	}
	
	@Override
	public String GetDescription(){
		
		return "Egg" + meal.GetDescription();
	}
	
}
