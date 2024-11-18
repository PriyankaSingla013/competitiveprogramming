/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* decrypt(int* code, int codeSize, int k, int* returnSize){
    *returnSize=codeSize;
    if(k==0){
        for(int i=0;i<codeSize;i++){
            code[i]=0;
        }
        return code;
    }
    int* res=malloc(sizeof(int)*codeSize);
    if(k>0){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=code[i];
        }
        for(int i=0;i<codeSize;i++){
            sum-=code[i];
            sum+=code[(i+k)%codeSize];

            res[i]=sum;
        }
    }
    else{
        int sum=0;
        for(int i=codeSize-1;i>=codeSize+k;i--){
            sum+=code[i];
        }
        for(int i=0;i<codeSize;i++){
            res[i]=sum;
            sum+=code[i];
            sum-=code[(i+k+codeSize)%codeSize];
        }
    }
    return res;
}