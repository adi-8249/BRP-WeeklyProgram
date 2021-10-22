package WeeklyProblems;

 interface Shape {
	   void draw();
	}

 class Rectangle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Draw Rectangle");
	   }
	}
 class Square implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Draw Sqare");
	   }
	}
 class Circle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Draw Circle");
	   }
	}

 class ShapeFactory {
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE"))
	      {
	         return new Circle();
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE"))
	      {
	         return new Rectangle();
	         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	   }
	}

public class FactoryPatternExample {

	public static void main(String[] args) 
	{
		 ShapeFactory factory = new  ShapeFactory();
		 Shape shape1 = factory.getShape("CIRCLE");
		 
	      shape1.draw();

	    
	      Shape shape2 = factory.getShape("RECTANGLE");

	      
	      shape2.draw();

	      
	      Shape shape3 = factory.getShape("SQUARE");

	      
	      shape3.draw();

	}

}
