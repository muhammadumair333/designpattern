public class Test {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 8;
        String a1 = "hello";
        String b1 = "hello";

        A a2 = new A();


        System.out.println(a1.equals(a2.c));
        System.out.println(a1 == a2.c);

    }



    public static void change(int value){
         value += 4;
    }
}

class A {
    String a = "hel";
    String b = "lo";
    String c = a+b;
}
