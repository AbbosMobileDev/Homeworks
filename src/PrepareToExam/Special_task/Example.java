package PrepareToExam.Special_task;
public class Example {
    // function to convert numbers to words
    static void COnverNumberToWord(char[] InputNumber) {
        // Get the length of a number
        int NumberLength = InputNumber.length;

        // Basic cases
        if (NumberLength == 0) {
            System.out.println("The input is an empty string.");
            return;
        }
        if (NumberLength > 4) {
            System.out.println("The Length of the input number is more than 4 digits.");
            return;
        }

        // create an array for numbers in words; the first string will not be used.
        String[] Single_Numbers = new String[] {
                "no'l", "bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};

        // create an array for numbers in word; the first string will not be used.
        String[] Two_Numbers = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        // create arrays for numbers in words; the first two strings will not be used.
        String[] Tens_Numbers = new String[] {
                "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        String[] Hundred_Thousand = new String[] {"Hundred", "Thousand"};

        // this is used for debugging purposes only
        System.out.print(String.valueOf(InputNumber) + " = ");

        // for a single digit number
        if (NumberLength == 1) {
            System.out.println(Single_Numbers[InputNumber[0] - '0']);
            return;
        }

        // the while loop will be used if the number length is more than 0
        int i = 0;
        while (i < InputNumber.length) {
            // for the first two digits
            if (NumberLength >= 3) {
                if (InputNumber[i] - '0' != 0) {
                    System.out.print(Single_Numbers[InputNumber[i] - '0'] + " ");
                    System.out.print(Hundred_Thousand[NumberLength - 3] + " ");
                }
                --NumberLength;
            }

            // for the last two digits
            else {
                // 10-19 will be explicitly handled.
                if (InputNumber[i] - '0' == 1) {
                    int NumebrSum = InputNumber[i] - '0' + InputNumber[i + 1] - '0';
                    System.out.println(Two_Numbers[NumebrSum]);
                    return;
                }

                // the 20 will be explicitly handled
                else if (InputNumber[i] - '0' == 2 && InputNumber[i + 1] - '0' == 0) {
                    System.out.println("twenty");
                    return;
                }

                // for the rest of two digit numbers from 20 to 99
                else {
                    int a = (InputNumber[i] - '0');
                    if (a > 0)
                        System.out.print(Tens_Numbers[a] + " ");
                    else
                        System.out.print("");
                    ++i;
                    if (InputNumber[i] - '0' != 0)
                        System.out.println(Single_Numbers[InputNumber[i] - '0']);
                }
            }
            ++i;
        }
    }
}

