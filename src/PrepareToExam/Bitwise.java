package PrepareToExam;

public class Bitwise {
    public static void main(String[] args) {
//        int a = 5;   // 0101
//        int b = 3;   // 0011
//        int result = a & b;   // 0001
//        System.out.println(result);  // Natija: 1

//        int a = 5;   // 0101
//        int b = 3;   // 0011
//        int result = a | b;   // 0111
//        System.out.println(result);  // Natija: 7
//
//        int a = 5;   // 0101
//        int b = 3;   // 0011
//        int result = a ^ b;   // 0110
//        System.out.println(result);  // Natija: 6

        int a = 5;   // 0000 0000 0000 0000 0000 0000 0000 0101
        int result = ~a;  // 1111 1111 1111 1111 1111 1111 1111 1010
        System.out.println(result);  // Natija: -6 (32-bit integer sifatida)`

    }

}
