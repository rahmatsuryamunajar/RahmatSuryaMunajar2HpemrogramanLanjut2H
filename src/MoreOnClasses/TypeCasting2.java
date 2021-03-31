package MoreOnClasses;

public class TypeCasting2 {
    public static void main(String[] args) {
    }
    static class A {
        public void print() {
            System.out.println("A");
        }
    }
    static class B extends A {
        public void print() {
            System.out.println("B");
        }
        public static void main(String[ ] args) {
            A object = new B();
            B b = (B) object;
            b.print();
        }
    }
}
