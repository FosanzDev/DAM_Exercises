public class BusquedaBinaria {

    public static int[] intArr = {2, 3, 4, 5, 6, 7, 10, 20, 23, 25, 27, 30};
    
    /**
     * Return the index of the searched number
     * @param arr Array with elements 
     * @param n Integer to be indexed
     * @return Integer with the index. Returns -1 if it's not found
     */
    public static int binarySearch(int[] arr, int n){
        //Defining and initializing with info based on the length of the given array
        int startIndex = 0, endIndex = arr.length-1, searchDirection;
        //First nodeIndex is at the middle of the array
        int nodeIndex = arr.length/2;
        //Variables to check if the number has been found or subarray length = 1
        boolean found = false, inBound = true;

        //While no breaks (n != node || subArray length == 1)
        while(true){
            //node equals the value of the middle of the array
            int node = arr[nodeIndex];

            //If the value equals the number that needs to be found, breaks with true value
            if(n == node){
                found = true;
                break;
            }

            //If subArray length == 1 break with false value
            if(!inBound) break;

            //If no breaks: 
            //Checking wether subArray length == 1 (startIndex or endIndex == nodeIndex)
            inBound = startIndex == nodeIndex || endIndex == nodeIndex ? false : true;
            
            //If the given number > node
            if(n > node){
                //Cut from half to endIndex
                startIndex = nodeIndex;
                //Sets positive direction (LTR) 
                searchDirection = 1;
            }

            //If the given number < node
            else{
                //Cut from startIndex to half
                endIndex = nodeIndex;
                //Sets negative direction (RTL)
                searchDirection = -1;
            }

            //New nodeIndex --> direction (1/-1) + endIndex + startIndex*direction(1/-1) / 2 (Responds to the middle of the subArray)
            nodeIndex = (searchDirection +  endIndex + startIndex*searchDirection) / 2;

        }

        //If there was a break, check if the number was found or not
        if(found) return nodeIndex;
        else return -1;
    }

    public static void main(String[] args) {

        //Sample battery
        System.out.println(binarySearch(intArr, -11));
        System.out.println(binarySearch(intArr, 1));
        System.out.println(binarySearch(intArr, 2));
        System.out.println(binarySearch(intArr, 3));
        System.out.println(binarySearch(intArr, 4));
        System.out.println(binarySearch(intArr, 5));
        System.out.println(binarySearch(intArr, 6));
        System.out.println(binarySearch(intArr, 7));
        System.out.println(binarySearch(intArr, 10));
        System.out.println(binarySearch(intArr, 20));
        System.out.println(binarySearch(intArr, 23));
        System.out.println(binarySearch(intArr, 25));
        System.out.println(binarySearch(intArr, 27));
        System.out.println(binarySearch(intArr, 30));
        System.out.println(binarySearch(intArr, 31));
        System.out.println(binarySearch(intArr, 24));
        System.out.println(binarySearch(intArr, 11));

    }
}
