#include <iostream>
using namespace std;

int arr[1001];
int n;

int Count(int s){
    int cnt =1, sum = 0;
    for(int i =1; i <= n; i++){
        if(sum + arr[i] >s){
            cnt++;
            sum = arr[i];
        }
        else{
            sum = sum +arr[i];
        }
    }
    return cnt;

}

int main(){
    int m;
    int lt = 1 , rt = 0, mid, max = -2147000000, result;
    cin >> n >> m;

    for(int i = 1; i <=n; i++){
        cin >>arr[i];
        rt = rt+ arr[i];
        if(arr[i] > max)
        max = arr[i];
    }
    while(lt <= rt){
        mid = (lt + rt) / 2;
        if(mid >= max && Count(mid) <= m){
            result = mid;
            rt = mid -1;
        }else{
            lt = mid+1;
        }
    }

    cout << result;
     
}