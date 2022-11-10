class Task_1 {
    private int one;
    
    public int decrement() {
        return --one;
    }

	  public int increment() {
        return ++one;
    }
    
	//методы  increment(), увеличивающий на 1 и decrement() уменьшающий значение на 1
    
    public int add(int n) {
      if (n == 0) {
        return one;
      }
      else {
        increment();
        return add(--n);
      }
    }
    
    public int substract(int n) {
      if (n == 0) {
        return n;
      }
	    //методы сложения add(Int n) и вычитания substract(Int n)	
      
	else {
        decrement();
        return substract(--n);
      }
    }

    
    public String toString() { //метод 	toString()
        return "Is string: " + one;
    }
    
    public static void main(String[] args) {
        Task_1 numObj = new Task_1();
        System.out.println(numObj.increment());
        System.out.println(numObj.decrement());
        System.out.println(numObj.add(50));
        System.out.println(numObj.substract(50));
        
        while (numObj.add(20) < 1000) {
            
        }
        System.out.println(numObj.one);
        System.out.println(numObj.toString());
    }
}

