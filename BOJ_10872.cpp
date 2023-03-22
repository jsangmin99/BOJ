#include <iostream>
using namespace std;

int factorial(int num){
    if(num>2)
    num *= factorial(num-1);
    return num;   
}

int main(){
   int n, re=1;
   cin >>n;
   if(n != 0)
        re = factorial(n);
   cout<<re;
}   