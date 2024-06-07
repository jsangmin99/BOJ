#include <iostream>
using namespace std;

int main() {
    long n = 0, sum = 0;;
    cin  >> n;
    
    for (int i = 1; i <= n ; i++){
        sum += i;
    }
    cout << sum << "\n";
    cout << sum * sum << "\n";

    sum = 0;
    for(int i = 1; i <= n; i++){
        sum  += (i*i*i);
    }
    cout << sum ;
    return 0;
}
