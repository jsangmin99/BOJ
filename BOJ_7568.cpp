#include <iostream>
using namespace std;

int main(){
    int n;
    int x,y,count;
    int arr[51][3]; //0열= 키 ,1열 = 몸무게, 2열 = 등수

cin >> n;
for(int i=0; i<n;i++){
   cin>>arr[i][0]>>arr[i][1];
}

for(int i=0; i<n;i++){
    count= 1;
    for(int j=0;j<n;j++){
        if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]){
            count++;
        }
    }
    arr[i][2]=count;

}
for(int i=0;i<n;i++){
    cout<< arr[i][2]<<" ";
}
}