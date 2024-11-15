class Solution {
   public int findLengthOfShortestSubarray(int[] arr) {
		int left = 0, right = arr.length - 1, min_subarray_len = arr.length - 1;

		while (left < arr.length - 1 && arr[left] <= arr[left + 1])
			left++;

		while (right > 0 && arr[right] >= arr[right - 1])
			right--;

		min_subarray_len = Math.min(right, arr.length - left - 1); 

		int i = 0, j = right;

		while (i <= left && j < arr.length && i<j) {
			if (arr[i] <= arr[j]) {
				min_subarray_len = Math.min(min_subarray_len, j - i - 1);
				i++;
			} else {
				j++;
			}
		}

		return min_subarray_len;
	}
}