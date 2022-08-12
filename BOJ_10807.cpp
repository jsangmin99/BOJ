//개수 세기
#include<iostream>
using namespace std;
int main(){
    ios_base :: sync_with_stdio(false); 
    cin.tie(NULL); 
    cout.tie(NULL);

    int n;
    int v;
    int count=0;
    cin >> n;
    int arr[10001];
    for (int i = 0; i < n; i++){
        cin >> arr[i];
    }
    cin >>v;
    for (int i = 0; i < n; i++) {
        if (arr[i] == v){
            count++;
        }
    }
    cout << count;
}