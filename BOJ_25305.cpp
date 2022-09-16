# include <iostream>
#include<algorithm>
using namespace std;
int main(){
    int member=0, rank = 0;
    cin >> member >> rank;
    int arr[10000];

    for (int i = 0; i < member; i++) cin >> arr[i];

    sort(arr, arr + member);
    cout <<arr[member - rank];

}