void swap(char* a,char* b){
    char t=*a;
    *a=*b;
    *b=t;
}
bool areAlmostEqual(char * s1, char * s2){
    if(strlen(s1)!=strlen(s2)){
        return 0;
    }
    int flag=0;
    for(int i=0;i<strlen(s1);i++){
        if(flag==1 && s1[i]!=s2[i]){
            return 0;
        }
        else if(s1[i]!=s2[i]){
            flag=1;
            int j;
            for(j=i+1;j<strlen(s1);j++){
                if(s1[i]==s2[j] && s1[j]!=s2[j]){
                    break;
                }
            }
            if(j<strlen(s1)){
            swap(&s2[i],&s2[j]);
            }
            else {
                return 0;
            }
        }
    }
    return 1;
}
