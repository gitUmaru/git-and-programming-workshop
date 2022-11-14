import java.util.List;

public class SignalEnveloping {
    SignalEnveloping (){
        System.out.println("==== SIGNAL ENVELOPING ====");
    }

    public static int envelope(Integer[] signal){
        /*YOUR IMPLEMENTATION HERE*/
        return -1;
    }

    public static void testCases(){
        int testCase1 =  envelope(new Integer[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        int testCase2 =  envelope(new Integer[]{4,2,0,3,2,5});

        System.out.println(String.format("TEST CASE 1: %s", testCase1 == 6 ? "PASSED" : "FAILED"));
        System.out.println(String.format("TEST CASE 2: %s", testCase2 == 9 ? "PASSED" : "FAILED"));

    }
}
