//집합
#include<iostream>
#include <cstring>
using namespace std;
int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int M , x;
    string s;
    int arr[21] = {0, };
    
    cin >> M;

    for (int i = 0; i < M; i++){
        cin >> s;

        if(s == "add"){
            cin >> x;
            if(arr[x] == 0) arr[x]=1;
        }
        else if(s == "remove"){
            cin >> x;
            if(arr[x] == 1) arr[x]=0;
        }
        else if(s == "check"){
            cin >> x;
            if(arr[x] == 1) 
                cout << "1\n";
            else 
                cout << "0\n";
        }
        else if(s == "toggle"){
            cin >> x;
            if(arr[x] == 1)
                arr[x]=0;
            else
                arr[x] = 1;
        }
        else if(s == "all"){
            for (int j = 1; j < 21; j++) arr[j] = 1;
        }
        else if(s == "empty"){
            memset(arr, 0, sizeof(arr));
        }
    }
}