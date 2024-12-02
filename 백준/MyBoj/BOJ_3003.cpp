#include <iostream>
using namespace std;
int main(){
    int arr[6] = {1, 1, 2, 2, 2, 8};
    int in[6];
    for(int i = 0; i < 6; i++){
        cin>>in[i];
        cout <<arr[i]-in[i] << " ";
    }
}