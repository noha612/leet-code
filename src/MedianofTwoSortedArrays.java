import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        new MedianofTwoSortedArrays().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] r = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, r, 0, nums1.length);
        System.arraycopy(nums2, 0, r, nums1.length, nums2.length);
        Arrays.sort(r);
        return median(r);
    }

    private double median(int[] a) {
        if (a.length % 2 == 1) {
            return a[a.length / 2];
        }
        return (double) (a[a.length / 2 - 1] + a[a.length / 2]) / 2;
    }

    private double median(ArrayList<Integer> a) {
        if (a.size() % 2 == 1) {
            return a.get(a.size() / 2);
        }
        return (a.get(a.size() / 2 - 1) + a.get(a.size() / 2)) / 2;
    }
}
