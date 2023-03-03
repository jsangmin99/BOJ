//1로 만들기
#include<iostream>
#include<algorithm>
using namespace std;
int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    int arr[1000001]={0,};
    cin >> n;
    arr[1]=0;
    //속도가 중요 반복을 최대한 적게
    //bottom-up접근
    //배열에 그 숫자의 값이 들어올경우 몇번이 추가되는지를 적어둠(10이입력되면 10번 이하의 반복)
    for (int i = 2; i<=n; i++){
        arr[i]=arr[i-1]+1;
        if(i%2 == 0) arr[i] = min(arr[i],arr[i/2]+1);
        if(i%3 == 0) arr[i] = min(arr[i], arr[i/3]+1);
    }
    cout << arr[n];
}