#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int arr[2000];

int main(){
    int T, result = 0;
    cin >> T;
    
    for(int i = 0; i < T; i++){
        cin >> arr[i];
    }
    sort(arr, arr + T);

    for(int i = 0; i < T; i++){
        int first = 0, last = T - 1, sum;
        while(first < last){
            sum = arr[first] + arr[last];
            if(sum == arr[i]){ 
                if(first != i && last != i){
                    result++;
                    break;
                }
                else if(first == i) first++;
                else if(last == i) last--;
            }
            else if(sum < arr[i]) first++;
            else last--;
        }
    }
    cout << result;
    return 0;
}
