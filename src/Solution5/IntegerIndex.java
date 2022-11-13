package Solution5;

public class IntegerIndex {public static int searchElementAndReturnIndex(int[] array, int num) {
    if (array == null || array.length == 0) {
        return -1;
    }
    int start = 0;
    int end = array.length - 1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if ((array[mid] == num) && ((mid == 0) || (array[mid - 1] < num))) {
            return mid;
        } else if (num <= array[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return -1;
}


    public static void main(String[] args) {
        int[] array = {0,0,0,0,0,1,1,1,1,2,2,5,5,5,8,9,10,11};
        int nums[] = {1,4,5,10};
        int [] res = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            int index = searchElementAndReturnIndex(array, nums[i]);
            res[i]= index;
            //  System.out.println("Element " + num + (index >= 0 ? (" found at index " + index) : -1);
        }
        for(int i:res) System.out.println(i);
    }
}
