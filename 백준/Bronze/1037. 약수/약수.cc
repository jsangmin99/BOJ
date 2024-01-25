#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int N;
    int arr[51];
    cin >> N;
    for(int i = 0; i < N; i++){
        cin >> arr[i];
    }
    sort(arr, arr+N);

    int answer = arr[0] * arr[N-1];
    cout << answer;
}
    
