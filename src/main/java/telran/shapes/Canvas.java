package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape{
   Shape[] shapes;
   public Canvas() {
    shapes = new Shape[0];
   }
   public void addShape(Shape shape) {
    //TODO
   }
    @Override
    public int perimiter() {
        // TODO
        //sum of all included shape perimiters 
        throw new UnsupportedOperationException("Unimplemented method 'perimiter'");
    }

    @Override
    public int square() {
        // TODO 
        //sum of all included shape squares
        throw new UnsupportedOperationException("Unimplemented method 'square'");
    }

}
