#include <iostream>
using namespace std;
string sol(int a, int b){
    int sum = a * (a+1)/2;
    return (sum == b) ? "YES":"NO";
}
int main(){
    int n, a, b;
    cin >> n;
    for(int i = 0; i<n; i++){
        cin >> a;
        cin >> b;
        cout << sol(a,b)<<"\n";
    }
}