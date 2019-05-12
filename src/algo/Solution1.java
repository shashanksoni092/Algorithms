package algo;

class Solution1 {
    public static void main(String[] args) {
        int noOfTestCases = Integer.parseInt(args[0]);
    //    System.out.println(noOfTestCases);
       
        int start = 0;
        int getCaseIndex = 1;
        while(start < noOfTestCases) {
           
            int getNumberOfElementsInCase = Integer.parseInt(args[getCaseIndex]);

            int arr[] = new int[getNumberOfElementsInCase]; // get number of elements for each test case
            getCaseIndex++;
           
            for(int i=0; i<getNumberOfElementsInCase; i++) {
                arr[i] = Integer.parseInt(args[getCaseIndex++]);
        //        System.out.print(arr[i] + " ");
            }
    //        System.out.println();
           
            TroubleSort(arr);
    //        System.out.println();
//           
//            for(int i: arr) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//           
           
            int getStatus = Check(arr);
            if(getStatus == -1) {
                System.out.println("Case #" + (start+1) + ":" + " OK");
            }
            else {
                System.out.println("Case #" + (start+1) + ": " + getStatus);

            }
       
            start++;
        }
       
    }

    public static void TroubleSort(int a[]) { // L is a 0-indexed list of integers
        boolean done = false;
        while (!done) {
            done = true;

            for (int i = 0; i < (a.length - 2); i++) {
                if (a[i] > a[i + 2]) {
                    done = false;
                    // reverse the sublist from L[i] to L[i+2], inclusive
                    int temp = a[i];
                    a[i] = a[i + 2];
                    a[i + 2] = temp;
                }
            }
        }
    } // Close to TroubleSort

   
    public static int Check(int a[]) {
        int index = -1;
        for(int i=0; i<a.length-1; i++) {
            if(a[i] > a[i+1]) {
                index = i;
                return index;
            }
        }
        return index;
    }
}

