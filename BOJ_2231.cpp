#include<iostream>
using namespace std;

int main(){
    int n,result=0;
    cin>>n;
    for(int i=0;i<n;i++){
        int num=i, sum=0;
        while(num!=0){
            sum += num%10;
            num /= 10;
        }

        if(sum+i==n){
            result=i;
            break;
        }
    }
    cout<<result;
}