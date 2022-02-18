package Working;

public class Main {
    public static void main(String[] args) {
        String a = "I like Java!!!";
        boolean result1;
        boolean result2;
        boolean result3;
        result1 = a.contains("Java");
        result2 = a.startsWith("I like");
        result3 = a.endsWith("!!!");
        if (result1 == true && result2 == true &&  result3 == true) {
            System.out.println(a.toUpperCase());
        }
        String b = a.replace('a', 'o');
        System.out.println(b.substring(7,11));
    }
}
