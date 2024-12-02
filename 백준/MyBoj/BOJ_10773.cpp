#include<iostream>
#include<stack>
using namespace std;
int main(){
    int number;
    int sum =0;
    stack<int> stk;
    cin >> number;
    for (int i = 0; i < number; i++)
    {
        int n;
        cin >> n;
        if(n != 0)
            stk.push(n);
        else
            stk.pop();
    }

    for(int i = 0; !stk.empty(); i++){
        sum += stk.top();
        stk.pop();
    }
    cout << sum;
    
}