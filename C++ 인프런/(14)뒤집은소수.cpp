#include <iostream>
using namespace std;

int reverse(int x){
    int result=0, tmp=0;
    while(x > 0){
        tmp = x%10;
        result = result * 10 + tmp;
        x /= 10;
    }
    return result;
}

bool isPrime(int x){
    bool flag =true;
    if (x==1) return false;
    
    for (int i = 2; i < x; i++)
    {
        if(x%i==0){
            flag=false;
            break;
        }
    }
    return flag;
    
}
int main(){
    int n, m, tmp=0, result=0;
    cin >> n;
    for(int i =0; i <n; i++){
        cin >> m;
        tmp = reverse(m);
        if(isPrime(tmp))
            cout << tmp << " ";
    }
}