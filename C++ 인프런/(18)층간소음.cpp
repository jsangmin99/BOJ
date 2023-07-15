#include <iostream>
using namespace std;
int main(){
    int n, max, cnt, M,result =0;
    cin >> n >> max;
    for (int i = 0; i < n; i++)
    {
        cin >> M;
        if (max < M) cnt++;
        else cnt=0;
        if(cnt>result)result = cnt;
    }
    if (result == 0)
         cout << "-1";
    else cout << result;
    
}