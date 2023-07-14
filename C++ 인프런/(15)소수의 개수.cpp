#include<iostream>
#include <vector>
using namespace std;
int sosu(int n){
    int count=0;
    vector<bool> is_prime(n + 1, true);
    is_prime[0] = is_prime[1] = false;

    for(int i = 2; i * i <=n; i++){
        if (is_prime[i])
        {
            for (int j = i * i ; j <= n; j+=i)
            {
                is_prime[j]= false;
            }
            
        }
    }
    for (int i = 2; i <= n; i++) {
        if (is_prime[i]) {
            count++;
        }
    }
    return count;
}
int main(){
    int n, result =0;
    cin >> n;
    result = sosu(n);
    cout << result;
}