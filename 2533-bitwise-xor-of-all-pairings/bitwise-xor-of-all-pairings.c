int xorAllNums(int* nums1, int nums1Size, int* nums2, int nums2Size){
    int res=0;
    if(nums1Size%2!=0){
        for(int i=0;i<nums2Size;i++){
            res^=nums2[i];
        }
    }
    if(nums2Size%2!=0){
        for(int i=0;i<nums1Size;i++){
            res^=nums1[i];
        }
    }
    return res;
}