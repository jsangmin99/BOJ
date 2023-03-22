#include <iostream>
#include <cmath>
using namespace std;
int main(){
    int h=0,m=0,s=0, time = 0;
    cin >> h >> m >> s >>time;

    s += time;
    while(s>=60){
        m++;
        s-=60;
    }
    while(m>=60){
        h++;
        m-=60;
    }
    while(h>=24){
        h-=24;
    }
    cout << h << " " << m << " " <<s;

}