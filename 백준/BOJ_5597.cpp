//과제 안 내신 분..?
#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    int arr[30]={0,};
    int result1;
    int result2;

    for (int i = 0; i < 28; i++){
        int n;
        cin >> n;
        arr[n-1] = 1;
    }
    for (int i = 0; i< 30; i++)
        if (arr[i]== 0) cout << i+1 << "\n";

    
}