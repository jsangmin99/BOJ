# include <iostream>
using namespace std;
int main(){
    int n = 0; 
    cin >> n;
    for(int i = 1; i <= n; i++){
        for(int k = 0; k < n-i; k++) cout << " ";
        for(int j = 1; j <= 2*i-1; j++) cout << "*"; //이거는 2N-1 개 찍는 것 
        cout << "\n";
    }
}