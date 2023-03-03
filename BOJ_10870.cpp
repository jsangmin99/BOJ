//피보나치 수5
#include <iostream>
using namespace std;

int function(int n){
    if(n>=2)
        return function(n-1)+function(n-2);
    else if (n==1)
        return 1;
    else
        return 0;
    
}

int main(){
    int num;
    cin >>num;
    cout<<function(num)<<"\n";

}   