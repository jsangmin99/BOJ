#include <iostream>
using namespace std;
int main()
{
    int n=0, a = 0, b = 1, cnt = 0, i = 0;

    cin >> a;

    n = a;
    a--;
    while (a > 0)
    {
        b++;
        a = a - b;
        if (a % b == 0)
        {
            for (i = 1; i < b; i++)
            {
                cout << ((a / b)+ i) << " + ";
            }
            cout << (a / b) + i << " = " << n << "\n";
            cnt++;
        }
    }
    cout << cnt;
    return 0;
}

