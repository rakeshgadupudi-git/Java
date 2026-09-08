public class q4assignment {
    static int a = 100;
    static long b = 200L;

    void display() {
        int c = (int) (a + b);
        System.out.println(a + b);
        System.out.println(c);
    }

    public static void main(String args[]) {
        q4assignment obj = new q4assignment();
        obj.display();
    }

}
