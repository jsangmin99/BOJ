#include <iostream>
using namespace std;
#include <stdio.h>
#include <string.h>
int cnt=0;
int recursion(const char *s, int l, int r){
    cnt ++;
    if(l >= r) return 1;
    else if(s[l] != s[r]) return 0;
    else return recursion(s, l+1, r-1);
}

int isPalindrome(const char *s){
    return recursion(s, 0, strlen(s)-1);
}

int main(){
    int n;
    string s;
    cin >> n;
    for(int i=0; i < n; i++){
        cnt=0;
        cin >> s;
        cout << isPalindrome(s.c_str()) << " " << cnt << "\n";
    }
}