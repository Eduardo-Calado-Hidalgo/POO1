package objetosConMetodos;

public class Person {
    
    // Propiedades
    
    private short yearOfBirth; // valor por defecto 2023 (acaba de nacer).
    private String name; // máximo 20 caracteres.
    private String surname; // máximo 20 caracteres.
    private boolean brokenName;
    private boolean brokenSurname;
    
    // Constructores

    public Person(short yearOfBirth, String name, String surname) {
        /*
        Solución con if
        if(yearOfBirth < 1900){
            yearOfBirth = 1900;
        } else if(yearOfBirth > 2023) {
            yearOfBirth = 2023;
        } 
        this.yearOfBirth = yearOfBirth;
        */
        
        // solución con ternario
        this.yearOfBirth = yearOfBirth < 1900 ? 1900:yearOfBirth > 2023 ? 2023 : yearOfBirth;
       
        if(name.length() > 20) {
            name = name.substring(0, 20);
            this.brokenName = true;
        }
        this.name = name.toUpperCase();
        
        if(surname.length() > 20) {
            surname = surname.substring(0, 20);
            this.brokenSurname = true;
        }
        this.surname = surname.toUpperCase();
    }

    public Person(String name, String surname) {
        this((short)2023, name, surname);
    }
    
    public Person(Person p){
        this.brokenName = p.brokenName;
        this.brokenSurname = p.brokenSurname;
        this.name = p.name;
        this.surname = p.surname;
        this.yearOfBirth = p.yearOfBirth;
    }
    
    // Métodos
    
    public void show(){
        /*
        System.out.printf("Person %s %s de %d años.%n",
                name, surname, 2023 - yearOfBirth);   
        */
        System.out.printf("Person %s(%b) %s(%b) de %d años.%n",
                name, brokenName, surname, brokenSurname, 2023 - yearOfBirth);
    }
    
    public boolean isBroken() {
        return brokenName || brokenSurname;
    }
    
    public boolean changeName(String name, String surname){
        boolean seDanLasCondiciones = false;
        
        if(name == null || surname == null)
            return false;
        
        for (int i = 0; i < name.length(); i++) {
            if(!(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' || name.charAt(i) == ' '))
                return false;
        }
        for (int i = 0; i < surname.length(); i++) {
            if(!(surname.charAt(i) >= 'A' && surname.charAt(i) <= 'Z' || surname.charAt(i) == ' '))
                return false;
        }
        
        if (!(name.trim().split(" ").length == 1 || name.trim().split(" ").length == 2))
            return false;
        
        if (!(surname.trim().split(" ").length == 1 || surname.trim().split(" ").length == 2))
            return false;
        if (name.length() > 20 | surname.length() > 20)
            return false;
        
        if (name.trim().length() == 0)
            return false;
        
        this.name = name;
        this.surname = surname;
        brokenName = brokenSurname = false; 
        return true;
    }

		public boolean changeSurname(String surname) {
        return this.changeName(this.name, surname);
    }

    public boolean changeName(String name) {
        return this.changeName(name, this.surname);
    }
    
    public short getAge() {
        return (short)(2023 - yearOfBirth);
    }
    
    public boolean compareWith(Person p) {
        
        return yearOfBirth == p.yearOfBirth && name == p.name && 
                surname == p.surname && brokenName == p.brokenName &&
                brokenSurname == p.brokenSurname;
    }
}
