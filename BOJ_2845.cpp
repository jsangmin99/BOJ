#include<iostream>
using namespace std;
int main(){
    int member, range, total;
    int arr[5];
    cin >> member >> range;
    total = member * range;
    for(int i =0; i<5; i++){
        cin >> arr[i];
    }
    for(int i = 0; i < 5; i++){
        cout << arr[i]-total<< " ";
    }

}