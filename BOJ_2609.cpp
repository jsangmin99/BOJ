//최대공대약수와 최소공배수
#define min(a,b)  ((a<b) ? a : b)
#include<iostream>
using namespace std;
int gcd(int x,int y){
    int r;
    for(int i = 1; i <= min(x,y); i++){
        if(x % i ==0 && y % i == 0)
            r = i;
    }
    return r;
}

int main(){
    int x,y;
    int gc, lc;
    cin >> x >> y;
    gc = gcd(x,y);
    lc = (x / gc) * (y / gc) * gc;
    cout << gc << "\n" << lc;
}