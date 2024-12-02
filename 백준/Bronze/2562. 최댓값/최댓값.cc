#include <iostream>
using namespace std;

int main() {
    int max = 0, idx = 0;
    int n;
    for(int i =1; i <= 9; i++){
        cin >> n;
        if(n >= max){
            max = n;
            idx = i;
        }
    }
    cout << max << "\n" << idx;
}
