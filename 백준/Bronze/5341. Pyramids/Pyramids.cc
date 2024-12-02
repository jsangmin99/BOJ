#include <iostream>
#include <string>
 
using namespace std;
 
int main() {
    int n;
    while(true){
        int result=0;
        cin >> n;
        if(n == 0) break;
        for (int i = 1; i <= n; i++)
            result += i;
        cout << result << "\n";
        }
    
    return 0;
}
