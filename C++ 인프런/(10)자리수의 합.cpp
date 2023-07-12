#include<iostream>
using namespace std;

int sum(int x){
    int result = 0;
    while(x > 0){
        result += x % 10;
        x /= 10;
    }
    return result;
}
int main(){
    int n, m, result, max = 0 ;
    cin >> n;
    int arr[n];

    for(int i=0; i < n; i ++ ){
        cin >> arr[i];
        if(max < sum(arr[i])) {
            max = sum(arr[i]);
            result = arr[i];
        }
        else if (sum(arr[i]) == max){
            if (arr[i] > result)
            {
                result = arr[i];
            }
            
        }
    }

    cout << result;
}