#include<iostream>
#include<vector>
using namespace std;
int main(){
    int n,m,j;
    vector<int> arr(1001);
    cin >> n;
    for(int i=2; i<=n; i++){
		m=i;
		j=2;
		while(1){
			if(m%j==0){
				m/=j;
				arr[j]++;
			}
			else j++;
			if(m==1) break;
		}
	}
    cout << n << "! = ";
    for (int i = 2; i <= n; i++)
    {
        if (arr[i] != 0)
        {
            cout << arr[i]<< " ";
        }        
    }
}