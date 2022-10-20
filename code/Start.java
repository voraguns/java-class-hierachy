class Start {
    public static void main(String[] args) {
        MyNumber m = new MyNumber();
        
        System.out.println(m);
        System.out.println(m.intValue());
    }
}

sealed class Pool permits Student, Staff { }

final class Student extends Pool { }
non-sealed class Staff extends Pool { }

class NationalTeam extends Staff { }


sealed class Product permits Online, Offline { }
final class Online extends Product { }
final class Offline extends Product { }

class MyNumber extends Number {
    public int intValue() { return 0; }
    public long longValue() { return 0; }
    public float floatValue() { return 0; }
    public double doubleValue() { return 0; }
}