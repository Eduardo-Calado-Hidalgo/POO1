package objetosConMetodos;

public class Vehiculo {
	    
	    // PROPIEDADES
	    private String matricula;
	    // Obligatoria, máximo 10 caracteres, solo letras mayúsculas y números 
	    // (formato "ABC1234"). Si no cumple el formato, se asigna "DESCONOCIDA".
	    private String tipo;
	    // Valores posibles: "coche", "moto", "camion", "bicicleta". Si no se 
	    // especifica o el valor es incorrecto, se asigna "coche".
	    private short anioFabricacion;
	    private int kilometraje;
	    private boolean requiereMantenimiento;

	    // CONSTRUCTORES 
	    public Vehiculo(String matricula, String tipo, short anioFabricacion, int kilometraje) {
	        // Valores válidos        
	        short anioFabricacionValido = anioFabricacion < 1990 ? 
	                                            1990: 
	                                            anioFabricacion > 2024 ? 2024: anioFabricacion;       
	        String tipoValido = "camion".equalsIgnoreCase(tipo) || "moto".equalsIgnoreCase(tipo) ||
	                "bicicleta".equalsIgnoreCase(tipo) ? tipo.toLowerCase(): "coche";
	        int kilometrajeValido = kilometraje < 0 ? 0: kilometraje;
	        
	        // Construcción con valores válidos
	        this.matricula = matriculaValida(matricula) ? matricula: "DESCONOCIDA";
	        this.tipo = tipoValido;
	        this.anioFabricacion = anioFabricacionValido;
	        this.kilometraje = kilometrajeValido;
	        requiereMantenimiento = false;
	    }
	    
	    public Vehiculo(Vehiculo vehi){
	        this.anioFabricacion = vehi.anioFabricacion;
	        kilometraje = vehi.kilometraje;
	        matricula = vehi.matricula;
	        requiereMantenimiento = vehi.requiereMantenimiento;
	        tipo = vehi.tipo;
	    }
	    
	    // MÉTODOS PÚBLICOS
	    
	    public void mostrar(){
	        
	        System.out.printf("Vehículo [%s] (%s) del año %d con %d km. Requiere mantenimiento: %s.%n",
	                matricula, tipo, anioFabricacion, kilometraje,
	                requiereMantenimiento ? "Si": "No");
	    }
	    
	    public boolean marcarParaMantenimiento(){
	        if(requiereMantenimiento){
	            return false;
	        } else {
	            requiereMantenimiento = true;
	            return true;
	        }
	    }
	    
	    public int calcularAntiguedad(){
	        return 2024 - anioFabricacion + 1;
	    }
	    
	    public boolean mismaAntiguedad(Vehiculo v){  
	        return anioFabricacion == v.anioFabricacion;
	    }
	    
	    public boolean esIgual(Vehiculo v){
	        return this.matricula.equals(v.matricula) && this.tipo.equals(v.tipo);
	    }
	    
	// MÉTODOS PRIVADOS 
	    private static boolean matriculaValida(String matricula){
	        if (matricula.length() > 10 || matricula.length() <= 4) return false;
	        for(int i=0;i <3;i++){
	            if(!(matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z')) return false;
	        }
	        
	        for(int i=3;i < matricula.length();i++){
	            if(!(matricula.charAt(i) >= '0' && matricula.charAt(i) <= '9')) return false;
	        }
	        
	        return true;
	    }
}
