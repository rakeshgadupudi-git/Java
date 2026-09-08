public class assignment4 {
    static byte a = 45;
    static short b = 12345;

    void display() {
        byte c = (byte) (a + b);
        System.out.println(a + b);
        System.out.println(c);
    }

    public static void main(String args[]) {
        assignment4 obj = new assignment4();
        obj.display();
    }
}
