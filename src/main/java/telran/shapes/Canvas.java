package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape {
    Shape[] shapes;

    public Canvas() {
        shapes = new Shape[0];
    }

    public void addShape(Shape shape) {
        shapes = Arrays.insert(shapes, shapes.length, shape);
    }

    @Override
    public int perimeter() {
      int res = 0;
      for(int i = 0; i < shapes.length; i++){
        res += shapes[i].perimeter();
      }
      return res;
    }

    @Override
    public int square() {
        int res = 0;
        for(int i = 0; i < shapes.length; i++){
          res += shapes[i].square();
        }
        return res; 
    }
    public int count() {
        int res = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Canvas canvas) { 
                res += canvas.count(); 
            }
            res++;
        }
        return res;
    }

}
