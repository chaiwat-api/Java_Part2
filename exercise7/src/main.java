public class main {
    public static void main(String[] args) {
        String string1 = "You and Me";
        String string2 = "you and me";
        String instr = "you";
        String string3 = "  Hello";

        //item1 string equal
        if (string1.equals(string2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        //item2 string contain
        if (string2.contains(instr)) {
            System.out.println(instr);
        }

        //item3 string length
        System.out.println(string1.length());
        System.out.println(string2.length());

        //item4 string substring
        System.out.println(string1.substring(1,5));
        System.out.println(string2.substring(1,5));

        //item5 string trim
        System.out.println(string3.trim());

        //item6 string Uppercase
        System.out.println(string3.trim().toUpperCase());

        //item7 Chaining
        System.out.println(string2.trim().replaceAll("\\s+", "").toUpperCase());
    }
}
