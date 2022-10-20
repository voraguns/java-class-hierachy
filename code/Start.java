class Start {
    public static void main(String[] args) {
        MyNumber m = new MyNumber();
        
        System.out.println(m);
        System.out.println(m.intValue());
    }
}

class MyNumber extends Number {
    public int intValue() { return 0; }
    public long longValue() { return 0; }
    public float floatValue() { return 0; }
    public double doubleValue() { return 0; }
}