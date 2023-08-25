#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main()
{
    int n,m, temp;
    int p1 = 0, p2 = 0, p3 = 0;
    vector<int> arr1;
    vector<int> arr2;
    

    cin >> n;
    for (int i = 0; i < n; i++)
    {
        temp = 0;
        cin >> temp;
        arr1.push_back(temp);
    }

    cin >> m;
    for (int i = 0; i < m; i++)
    {
        temp = 0;
        cin >> temp;
        arr2.push_back(temp);
    }

    sort(arr1.begin(), arr1.end());
    sort(arr2.begin(), arr2.end());

    vector<int> arr3;

    while (p1 < n && p2 < m)
    {
        if (arr1[p1] == arr2[p2])
        {
            arr3.push_back(arr1[p1++]);
            p2++;
        }
        else if (arr1[p1] < arr2[p2])
        {
            p1++;
        }
        else
            p2++;
    }

    
    for(int i =0; i< arr3.size(); i++){
        cout << arr3[i] << " ";
    }
}