#include<iostream>
using namespace std;
int main(){
    int n, digit, max =0, result;
    char arr[101];
    int D[10]={0,};
    cin >> arr ;
    for (int i = 0; arr[i] != '\0' ; i++)
    {
        digit = arr[i] -48;
        D[digit]++;
    }
    for(int i = 0; i<=9; i++){
        if(D[i] >= max){
            max= D[i];
            result = i;
        }
    }
    cout  << result;
    
}