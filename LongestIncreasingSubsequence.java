package com.test;

public class LongestIncreasingSubsequence {
    public static void main(String[] args)
    {
        int arr[] = { 5,86,52,15,24,36};
        int n = arr.length;
        System.out.println("Length of lis is " + lis(arr, n) + "\n");
    }
        static int max_ref;
    static int _list(int arr[], int n)
        {
            if (n == 1)
                return 1;

            int res, max_ending_here = 1;
            for (int i = 1; i < n; i++) {
                res = _list(arr, i);
                if (arr[i - 1] < arr[n - 1]
                        && res + 1 > max_ending_here)
                    max_ending_here = res + 1;
            }
            if (max_ref < max_ending_here)
                max_ref = max_ending_here;
            return max_ending_here;
        }
        static int lis(int arr[], int n) {
            max_ref = 1;
            _list(arr, n);

            return max_ref;
        }

    }



