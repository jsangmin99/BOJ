#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main(){
    vector <int> a;
    int N,num;
    cin >> N;
    for(int i=0; i<N;i++){
        cin >> num;
        a.push_back(num);
    }
    sort(a.begin() , a.end());
    for(int i=0; i<N;i++){
    cout<<a[i]<<"\n";
    }
    
}