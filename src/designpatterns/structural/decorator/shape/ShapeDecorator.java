package designpatterns.structural.decorator.shape;

public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;

   protected ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   public void draw(){
      decoratedShape.draw();
   }	
}
