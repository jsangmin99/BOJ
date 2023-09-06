#include<iostream>
#include<math.h>
using namespace std;
int main(){
    int arr[9][9];
    int avg = 0;
    int res =0;
    int sum =0;
    for(int i =0; i < 9; i++){
        sum =0;
        for(int j = 0; j<9; j++){
            cin >> arr[i][j];
            sum += arr[i][j];
        }
        avg = round(sum/9.0);
        cout << avg << " ";
        int temp = 0;
        int min =1000;
        for(int j =0; j<9; j++){
            temp=abs(arr[i][j]-avg);
            if(temp<min){
                min=temp;
                res=arr[i][j];
            }
            else if(temp==min){
                if(res<arr[i][j]) res=arr[i][j];
            }
        }
        cout << res<<"\n";
    }




}