#include <iostream>
using namespace std;

int arr[100][100];
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n,x,y,cnt=0;
    cin >> n;
    
    while(n--){
        cin >> x >> y;
        for(int i = x; i < x+10; i++){
            for(int j = y; j < y+10; j++){
                if(!arr[i][j]){
                    cnt++;
                    arr[i][j]=1;
                }
            }
        }
    }
    cout << cnt;
}