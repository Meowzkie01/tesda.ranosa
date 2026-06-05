public class Task3 {
    public static void main(String[] args) {
        String a = "Wow!";
        String b = "Wow";
        String c = "Different";
        String d = c;

        boolean b1 = a == b;                 // false unless we adjust
        boolean b2 = d.equals(b + "!");      // true if d == "Wow!"
        boolean b3 = !c.equals(a);           // true if c != a

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
