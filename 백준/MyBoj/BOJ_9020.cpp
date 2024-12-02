#include <iostream>
using namespace std;

int T, n;
int arr[10001];

void isPrime(){
    for(int i=2; i<10001;i++){
        for(int j=i*2;j<10001;j+=i){
            arr[j]=1;
        }
    }
}




int main(){
    isPrime();

    cin >>T;
    for(int i=0;i<T;i++){
        cin>>n;
        for(int i=0; i<n/2; i++){
            if(arr[n/2-i]==0){
                if(arr[n/2+i]==0){
                 cout <<n/2-i<<" "<<n/2+i<<"\n";
                 break;
                 }
             }
        }

    }

}