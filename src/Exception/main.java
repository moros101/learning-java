package Exception;

public class main {

    public static void main(String[] args) {

        /*
            Exception : event that occurs during execution of program
            disrupt your program normal flow
            creates an exception object containing info on err
            - type of exception or message
            - stack trace

            Object - throwable - error(JVM issues) and exception(code issues)

            2 types of exception
            - Unchecked ( Runtime ) - ClassCast, Arithmetic, IndexOutOfBound, NullPointer, IllegalArgument
            - Checked - Compile time

         */

//        String[] arr = new String[900000000*900000000*900000000]; // OutOfMemoryError

//        int num = 0;    // StackOverflowError
//        while(true){
//            num++;
//            System.out.println(num);
//        }


        // Exceptions
        Object val = 0;
//        System.out.println((String)val);  // ClassCast

//        int val1 = 5/0;  // Arithmetic
        int[] arr = new int[2];
//        System.out.println(arr[3]);   // OutOfBound
        String st = null;
//        System.out.println(st.charAt(0));   // NullPointer
//        int val2 = Integer.parseInt("abc");   // NumberFormat



    }


}
