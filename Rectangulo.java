package objetosConMetodos;

public class Rectangulo {
    int base;
    int altura;
    String color;
    
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5, 2, "rojo");
        Rectangulo r2 = new Rectangulo(5, 2);
        Rectangulo r3 = new Rectangulo();

        System.out.printf("Rectangulo %s de %d x %d%n", 
                r1.color, r1.base, r1.altura);
        System.out.printf("Rectangulo %s de %d x %d%n", 
                r2.color, r2.base, r2.altura);
        System.out.printf("Rectangulo %s de %d x %d%n", 
                r3.color, r3.base, r3.altura);
    }
    public Rectangulo(int miBase, int miAltura, String miColor){
        base = miBase;
        altura = miAltura;
        color = miColor;
    }        
    
    public Rectangulo(int miBase, int miAltura){
        base = miBase;
        altura = miAltura;
        color = "blanco";
    }   
        public Rectangulo(){
        base = 1;
        altura = 1;
        color = "blanco";
    }    
    
}
