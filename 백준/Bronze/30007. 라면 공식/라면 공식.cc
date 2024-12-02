#include <iostream>
using namespace std;

int main() {
    int T ,a, b, x;
    cin >> T;
    for(int i =0; i < T; i++){
        a= 0,b=0,x=0;
        cin >> a >> b>> x;
        cout << a*(x-1) + b<<"\n";
    }


    return 0;
}
