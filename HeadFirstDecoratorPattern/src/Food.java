import java.lang.*;
//Food class base abstract class

public abstract class Food {
	protected String description = "unknown food";
	
	public String GetDescription(){
		return this.description;
	}
	public abstract double Cost();
}
