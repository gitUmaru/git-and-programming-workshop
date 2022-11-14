public class MedicalImage {
    MedicalImage () {
        System.out.println("==== MEDICAL IMAGES ====");
    }

    public static Integer[][] rotate(Integer[][] image){
        /*YOUR IMPLEMENTATION HERE*/
        return new Integer[0][0];
    }

    public static void testCases(){
        Integer[][] testCase1 =  rotate(new Integer[][]{{1, 2, 3},
                                                        {4, 5, 6},
                                                        {7, 8, 9}});

        Integer[][] testCase2 =  rotate(new Integer[][]{{5,1,9,11},
                                                        {2,4,8,10},
                                                        {13,3,6,7},
                                                        {15,14,12,16}});

        Integer[][] answer1 = new Integer[][]{{7, 4, 1},
                                              {8, 5, 2},
                                              {9, 6, 3}};

        Integer[][] answer2 = new Integer[][]{{15,13,2,5},
                                              {14,3,4,1},
                                              {12,6,8,9},
                                              {16,7,10,11}};

        System.out.println(String.format("TEST CASE 1: %s", testCase1 == answer1 ? "PASSED" : "FAILED"));
        System.out.println(String.format("TEST CASE 2: %s", testCase2 == answer2 ? "PASSED" : "FAILED"));

    }
}
