public class BinarySearchAlgorithm {

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int up = list.length - 1;
        while (low <= up) {
            int mid = (low + up) / 2;
            if (key < list[mid])
                up = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 9, 10, 11, 12, 15};
        int key = 12;
        int pos = binarySearch(array, key);
        
        // Write key position
        System.out.println(pos);
    }
}