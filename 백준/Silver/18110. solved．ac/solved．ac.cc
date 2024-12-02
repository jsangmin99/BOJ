#include <iostream>
#include <cmath>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int N;
    double sum = 0;
    
    cin >> N;
    vector<int> arr(N);

    if(N == 0){
        cout << 0;
        return 0;
    }

    for(int i =0; i < N; i++){
        cin >> arr[i];
    }
    
    sort(arr.begin(), arr.end());

    int exclude = round(N * 0.15);

    for(int i = exclude; i < N - exclude; i++){
        sum += arr[i];
    }
    cout << round(sum/(N-exclude * 2));
    
    return 0;
}