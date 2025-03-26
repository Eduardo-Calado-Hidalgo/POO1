package objetosConMetodos;

public class Counter {

	    int value;
	    int maxValue;
	    String model;

	    void show() {
	        System.out.printf("Contador: modelo (%s) y valor %d de %d.%n",
	                model, value, maxValue);
	    }

	    void show(char c) {
	        System.out.printf("(%c)Contador: modelo (%s) y valor %d de %d.%n",
	                c, model, value, maxValue);
	    }

	    boolean increment() {
	        return increment(1);
	    }
	    
	    boolean increment(int n) {
	        if (value + n <= maxValue) {
	            value+=n;
	            return true;
	        } else {
	            value = maxValue;
	            return false;
	        }       
	    }
	    
	    boolean reset() {
	        if(value == maxValue) {
	            value = 0;
	            return true;
	        }      
	        return false;     
	    }
	    
	    
	    
	    
	    
	    
	    
	    

	    public Counter() {
	        this(100_000, "N-Counter");
	    }

	    public Counter(int maxValue) {
	        this(maxValue, "N-Counter");
	    }

	    public Counter(int maxValue, String model) {
	        value = 0;
	        this.maxValue = maxValue > 10 ? maxValue : 10;
	        this.model = model;
	    }

	    public Counter(Counter c) {
	        value = c.value;
	        maxValue = c.maxValue;
	        model = c.model;
	    }
}
