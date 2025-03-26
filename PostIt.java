package objetosConMetodos;


public class PostIt {
    
    String color;
    String msg;
    int alto;
    int ancho;
    
    public static void main(String[] args) {
       PostIt p;
        PostIt p1 = new PostIt();
        p = p1;
        p.color = "rosa"; 
        p.msg = "AA"; 
        p.alto = 50; 
        p.ancho = 50; 
        System.out.printf("Post It %s de %d x %d con mensaje: %s%n",
                p.color, p.alto, p.ancho, p.msg);

        PostIt p2 = new PostIt();
        p = p2;
        p.color = "amarillo"; 
        p.msg = "BB"; 
        p.alto = 50; 
        p.ancho = 50; 
        System.out.printf("Post It %s de %d x %d con mensaje: %s%n",
                p.color, p.alto, p.ancho, p.msg);
        
        PostIt p3 = new PostIt();
        p = p3;
        p.color = "naranja"; 
        p.msg = "CC"; 
        p.alto = 30; 
        p.ancho = 30; 
        System.out.printf("Post It %s de %d x %d con mensaje: %s%n",
                p.color, p.alto, p.ancho, p.msg); 
        
        PostIt p4 = new PostIt();
        p = p4;
        p.color = "azul"; 
        p.msg = "DD"; 
        p.alto = 30; 
        p.ancho = 30; 
        System.out.printf("Post It %s de %d x %d con mensaje: %s%n",
                p.color, p.alto, p.ancho, p.msg);        
    }  
}
