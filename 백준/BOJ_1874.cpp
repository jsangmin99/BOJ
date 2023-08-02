//스택 수열
#include<iostream>
#include <stack>
#include <vector>
using namespace std;
int main(){
    stack<int> st;
    vector<char> v;
    int cnt=1;
    int n;
    cin >> n;

    for(int i=0; i<n; i++ ){
        int x;
        cin >>x;
        while (cnt <= x){
            st.push(cnt);
            cnt += 1;
            v.push_back('+');
        }
        if (st.top() == x){
            st.pop();
            v.push_back('-');
        }else{
            cout << "NO";
            return 0;
        }
    }
    for (int i = 0; i < v.size(); i++){
        cout << v[i] << "\n";
    }
    return 0;
}