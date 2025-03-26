package objetosConMetodos;

public class Reloj {

    int horas;  // default 0, entre 0 y 23
    int minutos; // default 0, entre 0 y 59
    String modelo; // default BASIC-WATCH
    boolean en24Horas; // default true

    // CONSTRUCTORES
    public Reloj(int horas, int minutos, String modelo) {
        this.horas = horas < 0 ? 0 : horas > 23 ? 23 : horas;
        this.minutos = minutos < 0 ? 0 : minutos > 59 ? 59 : minutos;
        this.modelo = modelo == null ? "BASIC-WATCH" : modelo;
        en24Horas = true;
    }

    public Reloj() {
        this(0, 0);
    }
    
    public boolean setHora(int horas, int minutos) {
        boolean horaCorrecta = horas >= 0 && horas <= 24 && minutos >= 0 && minutos <=59 ;
        if(horaCorrecta){
            this.horas = horas;
            this.minutos = minutos;  
        }
        return horaCorrecta;
        
        
    }


    public Reloj(int horas, int minutos) {
        this(horas, minutos, "BASIC-WATCH");
    }

    public Reloj(Reloj reloj) {
        horas = reloj.horas;
        minutos = reloj.minutos;
        modelo = reloj.modelo;
        en24Horas = reloj.en24Horas;
    }

    public void mostrarHora() {
        if (en24Horas) {
            System.out.printf("Reloj (%s): %02d:%02d.%n", modelo, horas, minutos);
        } else {
            System.out.printf("Reloj (%s): %02d:%02d %s.%n",
                    modelo,
                    horas > 12 ? horas - 12 : horas,
                    minutos,
                    horas > 12 ? "PM" : "AM");
        }

    }

    public boolean incrementarMinuto() {
        minutos = minutos == 59 ? 0 : minutos + 1;
        horas = minutos == 0
                ? (horas == 23 ? 0 : horas + 1)
                : horas;
        return true;
    }

    public boolean cambiarFormato() {
        return en24Horas = !en24Horas;
    }

    public boolean reinicar() {
        /* 
        boolean reseteable = horas == 12 && minutos == 0;
        horas = reseteable ? 0: horas;
        return reseteable;
         */

        boolean reseteable;
        if (reseteable = horas == 12 && minutos == 0) {
            horas = 0;
        }
        return reseteable;
    }


    public static void main(String[] args) {
        Reloj r1 = new Reloj(17, 1);
        Reloj r2 = new Reloj(7, 8);
        r1.en24Horas = r2.en24Horas = false;
        r1.mostrarHora();
        r2.mostrarHora();

    }
}
