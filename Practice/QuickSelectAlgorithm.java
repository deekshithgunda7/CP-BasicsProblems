import java.util.*;

class TUF{
static int partition(int[] arr, int left, int right) {
    int pivot = arr[left] ;
    int l = left + 1 ;
    int r = right;
    while (l <= r) {
        if (arr[l] < pivot && arr[r] > pivot) {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++ ;
            r-- ;
        }
        if (arr[l] >= pivot) {
            l++;
        }
        if (arr[r] <= pivot) {
            r--;
        }
    }
    int temp2=arr[left];
            arr[left]=arr[r];
            arr[r]=temp2;
    return r;
}

static int kth_Largest_Element(int[] arr, int k) {
    int left = 0, right = arr.length - 1, kth;
    while (true) {
        int idx = partition(arr, left, right);
        if (idx == k - 1) {
            kth = arr[idx];
            break;
        }
        if (idx < k - 1) {
            left = idx + 1;
        } else {
            right = idx - 1;
        }
    }
    return kth;
}

public static void main(String args[]) {

    int arr[]={12,3,5,7,4,19,26};

    int n = arr.length, k = 1;
    System.out.println("Kth Largest element is "+kth_Largest_Element(arr, k));
    }
}