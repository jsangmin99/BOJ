#include <iostream>
using namespace std;
int arr[101];
int n, m;
int main()
{
    cin >> n >> m;
    while (m--)
    {
        int i, j, k;
        cin >> i >> j >> k;
        for (int q = i; q <= j; q++)
        {
            arr[q] = k;
        }
    }
    for (int i = 1; i <= n; i++)
        cout << arr[i] << " ";
}