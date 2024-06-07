#include <iostream>
using namespace std;

int main() {
    int T = 0, sum = 0;
    cin >> T;
    for(int i = 0; i <T; i++){
        int tmp = 0;
        cin >> tmp;
        sum += tmp;
    } 
    if(sum > 0)
        cout << "Right";
    else if(sum < 0)
        cout << "Left";
    else
        cout << "Stay";
    return 0;
}
