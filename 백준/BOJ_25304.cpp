#include <iostream>
using namespace std;
int main(){
    int result=0; //영수증 결과
    int num =0;
    int price =0;
    int count=0;
    int total=0;
    cin >>result;
    cin >> num;
    for (int i = 0; i < num; i++)
    {
        cin >> price;
        cin >> count;
        total += (price* count); 
    }
    if (total == result)
    {
        cout << "Yes";
    }else{
        cout << "No";
    }
    
   return 0; 
}