int isPrefixOfWord(char * sentence, char * searchWord){
    int idx=1;
    if(sentence[0]==searchWord[0]){
            int flag=0,j;
            for(j=0;j<strlen(searchWord);j++){
                if(sentence[j]!=searchWord[j]){
                    flag=1;
                    break;
                }
            }
            if(j!=strlen(searchWord)){
                flag=1;
            }
            if(flag==0){
                return idx;
            }
    }
    for(int i=0;i<=strlen(sentence)-strlen(searchWord);i++){
        while(sentence[i]!=' ' && i<strlen(sentence)){
            i++;
        }
        if(i==strlen(sentence)){
            break;
        }
        else{
            idx++;
            i++;
        }
        if(sentence[i]==searchWord[0]){
            int flag=0,j;
            for(j=0;j<strlen(searchWord);j++){
                if(sentence[i+j]!=searchWord[j]){
                    flag=1;
                    break;
                }
            }
            if(j!=strlen(searchWord)){
                flag=1;
            }
            if(flag==0){
                return idx;
            }
        }
    }
    return -1;
}
