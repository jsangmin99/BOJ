#include<iostream>
using namespace std;
int main(){
    int x, y;
    cin >> x >> y;
    if(x > y)
        cout << 1;
    else if (x == y)
        cout << 0;
    else
        cout << -1;
    return 0;
}