#include <iostream>
#include <vector>
#include <string>
#include <map>
#include <algorithm>
using namespace std;

int main()
{
    int t, n;
    string a,b;
    cin >> t;
    for(int i =0; i < t; i++){
        cin >> n;
        map<string,int> mp;
        for(int j = 0; j<n; j++){
            cin >> a >> b;
            mp[b]++;
        }
        int result =1;
        for (auto i : mp)
        {
            result *= i.second + 1;
        }
        result--;
        cout << result << "\n";
    }
    
    
    
}