#include <iostream>
using namespace std;

int main() {
    int N, answer=1;
    cin >> N;
    for(int i = N; i >= 1; i--){
        answer *=i; 
    }
    cout << answer;
}
    
