bool dfs(char* s,char* goal,int idx){
    int l=strlen(s);
    for(int i=0;i<strlen(s);i++){
        if(s[i]!=goal[(i+idx)%l]){
            return 0;
        }
    }
    return 1;
}
bool rotateString(char * s, char * goal){
    if(strlen(goal)!=strlen(s)){
        return 0;
    }
    for(int i=0;i<strlen(s);i++){
        if(s[0]==goal[i]){
            if(dfs(s,goal,i)){
                return 1;
            }
        }
    }
   
    return 0;
}