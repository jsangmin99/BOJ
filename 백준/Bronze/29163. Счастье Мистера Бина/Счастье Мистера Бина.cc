#include <iostream>
using namespace std;

int main() {
    int T = 0, count =0;
    cin >> T;
    for(int i =0; i < T; i++){
        int temp = 0;
        cin >> temp;
        if (temp % 2 == 0){
            count++;
        }else {
            count--;
        }
    }
    if(count > 0){
        cout << "Happy";
    }else{
        cout << "Sad";
    }
    
    return 0;
}
