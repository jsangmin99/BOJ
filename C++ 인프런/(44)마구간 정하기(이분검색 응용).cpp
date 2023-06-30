#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int n;
int Count(int len ,vector<int> arr){
    int cnt =1, pos = arr[1];
    for(int i =2; i <= n; i++){
        if(arr[i] - pos >=len){
            cnt++;
            pos = arr[i];
        }
    }
    return cnt;

}

int main(){
    int  c;
    int lt = 1 , rt = 0, mid, max = -2147000000, result;
    cin >> n >> c;

    vector<int> arr(n+1);

    for(int i = 1; i <=n; i++){
        cin >>arr[i];
    }
    sort(arr.begin(), arr.end());

    rt = arr[n];

    while(lt <= rt){
        mid = (lt + rt) / 2;
        if(Count(mid, arr) >= c){
            result = mid;
            lt = mid + 1;
        }else{
            rt = mid-1;
        }
    }

    cout << result;
     
}