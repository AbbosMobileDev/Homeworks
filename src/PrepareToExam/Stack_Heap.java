package PrepareToExam;

public class Stack_Heap {
    public static void main(String[] args) {
//        byte a = 123;
//        short b = a;
//        int c = b;
//        long d = c;
//        String s = "Hello";
//        s = s.concat("world");//qo’shish
//        s = s.toUpperCase();//katta shiriftga o’tkazish
//        s = s.toLowerCase();//kichish shiriftga o’tkazish
//        boolean t = s.contains("ll");//qidiradi


        StringBuffer strBuffer = new StringBuffer("Java");
        char c = strBuffer.charAt(0); // J
        System.out.println(c);
        strBuffer.setCharAt(0, 'c');
        System.out.println(strBuffer.toString()); // cava


    }
}
