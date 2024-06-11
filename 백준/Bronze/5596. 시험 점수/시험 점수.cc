#include <iostream>
#include <string>
using namespace std;

int main() {
    int sum = 0;
    int sum2 = 0;
    for(int i = 0 ; i < 4; i++){
        int n;
        cin >> n;
        sum += n;
    }
    for(int i = 0 ; i < 4; i++){
        int n;
        cin >> n;
        sum2 += n;
    }
    if(sum > sum2 ? cout << sum : cout << sum2);
}
