public class PalindromicSeq {
    PalindromicSeq (){
        System.out.println("==== PALINDROMIC SEQUENCES ====");
    }

    public static boolean isPalindrome(String seq){
        /*YOUR IMPLEMENTATION HERE*/
        return false;
    }

    public static void testCases(){
       boolean testCase1 =  isPalindrome("ATGC");
       boolean testCase2 =  isPalindrome("GAATTC");
       boolean testCase3 =  isPalindrome("CCTAGG");

       System.out.println(String.format("TEST CASE 1: %s", testCase1 == false ? "PASSED" : "FAILED"));
       System.out.println(String.format("TEST CASE 2: %s", testCase2 == true ? "PASSED" : "FAILED"));
       System.out.println(String.format("TEST CASE 3: %s", testCase3 == true ? "PASSED" : "FAILED"));
    }
}
