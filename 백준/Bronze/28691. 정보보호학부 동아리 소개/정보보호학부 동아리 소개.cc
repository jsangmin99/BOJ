#include <iostream>
using namespace std;

int main() {
    string s;
    cin >> s;

    if(s == "M")
        cout << "MatKor";
    if(s == "W")
        cout << "WiCys";
    if(s == "C")
        cout << "CyKor";
    if(s == "A")
        cout << "AlKor";
    if(s == "$")
        cout << "$clear";
    
    
    return 0;
}
