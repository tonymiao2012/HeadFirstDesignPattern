
public class Chicken extends Ingredients{
	Food meal;
	
	public Chicken(Food meal){
		this.meal = meal;
	} 
	
	@Override 
	public String GetDescription(){
		return "Kong pao " + meal.GetDescription();
	}
	
	@Override
	public double Cost(){
		return 9.0 + meal.Cost();
	}
}
