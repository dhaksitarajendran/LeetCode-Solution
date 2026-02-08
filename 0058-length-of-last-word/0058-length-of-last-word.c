int lengthOfLastWord(char* s) {
    int count =0 ;
    int len = strlen(s)-1;
    for(int i= len ; i>=0 ; i--){
        if(count==0 && s[i]==' ')
            continue;
        if(s[i]!=' ')
            count++;
        if(count>0 && s[i]==' ')
            break;
    }
    return count;
}