public class StrinOp {
    public static void main(String[] args) {


        String str = "  KodNest Tech";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(9));
        System.out.println(str.trim());

        char[] chArr = str.toCharArray();
        for (char x : chArr) {
            System.out.print(x + " ");
        }

        String[] strArr = str.split("e");
        for (String x : strArr) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println(str.substring(4));
    }
}