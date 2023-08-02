#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int N, M;
vector<int> arr;
int main(){
    ios_base :: sync_with_stdio(false); 
    cin.tie(NULL); 
    cout.tie(NULL);

    cin >> N;
    for (int i = 0; i < N; i++){
        int x=0;
        cin >> x;
        arr.push_back(x);
    }
    sort(arr.begin(),arr.end());

    cin >> M;
    for(int i = 0; i < M; i++){
        int x = 0;
        cin >> x;

        cout << upper_bound(arr.begin(), arr.end(), x) - lower_bound(arr.begin(), arr.end(), x) << " ";
    }
    
    return 0;
}