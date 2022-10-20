class Start {
    public static void main(String[] args) {
       A.B.C w = new A.B.C();
       w.showDetail();
    }
}

class A {
    static class B {
        static class C {
            void showDetail() {
                System.out.println("ABC");
            }
        }
    }
    void test() {
        M m = new M();
    }
    class M { }
    static class Z { }
    class Z { }
    interface I { }
    record R() { }
    enum E { }
}