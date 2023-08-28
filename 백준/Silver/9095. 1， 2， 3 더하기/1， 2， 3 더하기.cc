#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
    int t;
    int dp[11] = {1, 2, 4};

    for (int i = 3; i < 11; i++)
    {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    }

    cin >> t;
    for (int i = 0; i < t; i++)
    {
        int n = 0;
        cin >> n;
        cout << dp[n - 1] << "\n";
    }
}