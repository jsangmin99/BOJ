#include <iostream>

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    if(n > m){
        cout << 24 - n + m;
    }else{
        cout << m-n;
    }

return 0;
}
