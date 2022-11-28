public class Int {
    private int one;
    
    public Int(){
        one = 0;
    }

    public Int(int one){
        this.one = one;
    }

    //методы  increment(), увеличивающий на 1 и decrement() уменьшающий значение на 1
    public Int increment(){
        ++one;
        return this;
    }
    public Int decrement(){
        --one;
        return this;
    }

    // методы add(Int n) и вычитания substract(Int n)
    public Int add(Int n){

        if (n.getValue() == 0){
            return this;
        }
        else if (n.getValue() < 0) {
            decrement();
            return add(n.increment());
        } 
        else {
            increment();
            return add(n.decrement());
        }
    }

    public Int substract(Int n) {
        
        if (n.getValue() == 0) {
            return this;
        }

        else if (n.getValue() < 0) {
            increment();
            return substract(n.increment());
        }
        else {
            decrement();
            return substract(n.decrement());
        }
    }

    public int getValue() {
        return one;
    }

    public String toString() { //метод 	toString()
        return "Is string: " + getValue();
    }

    public static int pow(int n, int m) {
        int result = 1;
        for (int i = 1; i <= m; i++) {
            result = result * n;
        }
        return result;
    }

    public static void main(String args[]) {
        Int a = new Int();

        a.increment();
        a.increment();

        while (a.getValue() < 1000){
            Int b = new Int(a.getValue());
            a.add(b);
            System.out.println(a.toString());
        }
        while (a.getValue() != 1000) {
            a.decrement();
            System.out.println(a.toString());
        }
        while (a.getValue() != 0){
            Int b = new Int(a.getValue());
            a.substract(b);
        }
        System.out.println(a.toString());
        System.out.println("Возвдение числа в степень");
        System.out.println(pow(4, 4));

    }
}
