
public class Tomato extends Ingredients{

	Food meal;
	public Tomato(Food meal){
		this.meal = meal;
	}
	
	@Override
	public double Cost(){
		return 3.0 + meal.Cost();
	}
	
	@Override 
	public String GetDescription(){
		
		return "Tomato" + meal.GetDescription();
	}
}
