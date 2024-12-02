#include <iostream>

using namespace std;

int main() {
    string s = "WelcomeToSMUPC";
    int n;
    cin >> n;
    if(n%14 == 0){
        cout << "C";
    }else{
        cout << s[(n%14)-1];
    }
    

return 0;
}
