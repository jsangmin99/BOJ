#include <iostream>
using namespace std;

int main()
{
    int num;
    int max=0;
    int x,y;
    for(int i =1; i<10; i++){
        for(int j = 1; j <10 ; j++){
            cin >> num;    
            if(num >= max){
                max = num;
                x = i;
                y = j;
            }
        }
    }
    cout << max << "\n";
    cout << x << " " << y;
}