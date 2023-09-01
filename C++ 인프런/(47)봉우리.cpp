#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(void)
{
	int n, i, j, t, count = 0;
	cin >> n;

	vector<vector<int>> vInt;
	vector<int> vTemp;

	for (i = 0; i < n + 2; ++i)
	{
		vTemp.clear();
		for (j = 0; j < n + 2; ++j)
		{
			if (i == 0 || i == n + 1 || j == 0 || j == n + 1) vTemp.push_back(0);
			else {
				cin >> t;
				vTemp.push_back(t);
			}
		}
		vInt.push_back(vTemp);
	}

	for (i = 1; i <= n; ++i)
	{
		for (j = 1; j <= n; ++j)
		{
			t = vInt[i][j];
			if (vInt[i - 1][j] < t && vInt[i + 1][j] < t &&
				vInt[i][j - 1] < t && vInt[i][j + 1] < t)
				++count;
		}
	}

	cout << count << endl;

	return 0;
}