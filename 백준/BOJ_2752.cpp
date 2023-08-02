#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main(){
    int a;
    vector<int> n;
    for(int i=0; i<3; i++){
        cin>>a;
        n.push_back(a);
    }
    sort(n.begin(), n.end());

    for(int i=0; i<3; i++){
        cout << n[i] << " ";
    }
}