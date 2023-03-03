#include <iostream>
#include <vector>
using namespace std;
int main(){
    int arr[1000];
    int N,num;

    cin>>N;
    for(int i=0; i<N; i++){
        cin>>arr[i];
    }
    for(int i=N; i>1;i--){
        for(int j=0; j+1<i;j++){
            if(arr[j]>arr[j+1]){
                num=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= num;
            }
        }
    }
    for(int i=0;i<N;i++){
        cout<<arr[i]<<"\n";
    }
}