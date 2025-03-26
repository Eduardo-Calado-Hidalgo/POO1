package objetosConMetodos;

import java.util.function.Predicate;

public class Vector {
    int x;
    int y;

    // public Vector() {}
    public Vector(int x) {
        this.x = x;
        this.y = x;
    }
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Vector(Vector v) {
        this.x = v.x;
        this.y = v.y;
    }
    
    public void show(){
        System.out.printf("Vector de coordenadas (%d, %d)%n", x, y);
    }
    
    public Vector suma(Vector v) {
        if (v == null) return null;
        return new Vector(x + v.x, y + v.y);
    }
    public Vector resta(Vector v) {
        if (v == null) return null;
        return new Vector(x - v.x, y - v.y);
    }
    
    public int prodE(Vector v) {
        if (v == null) return 0;
        return this.x * v.x + this.y * v.y;
    }
    public int prodV(Vector v) {
        if (v == null) return 0;
        return this.x * v.y - this.y * v.x;
    }
    
    public Vector opera(Vector v, char operacion) {
        if (v == null) return null;
        switch (operacion) {
            case '+':
                System.out.printf("(%d,%d) + (%d, %d) = (%d,%d)%n",
                        this.x, this.y, v.x, v.y, this.suma(v).x, this.suma(v).y);
                return this.suma(v);
            case '-':                
                System.out.printf("(%d,%d) - (%d, %d) = (%d,%d)%n",
                        x, y, v.x, v.y, resta(v).x, resta(v).y);
                return resta(v);
            default:
                System.out.println("Resultado nulo");        
                return null;
        }
    }
    
    public Vector prod(int n){
         return new Vector(x * n, y * n);
    }
    
    public Vector opera(int n){
        System.out.printf("%d * (%d, %d) = (%d,%d)",
                n, x, y, prod(n).x, prod(n).x);
        return prod(n);
    }
    
    public static void main(String[] args) {
        // Vector v1 = new Vector(5);
        Vector v1 = new Vector(5);
        v1.show();
        Vector v2 = new Vector(3, 4);
        v2.show();
        Vector v3 = new Vector(v1);
        v3.show();
        v1.opera(v2, '*');
        v1.prod(10).show();
    }
}
