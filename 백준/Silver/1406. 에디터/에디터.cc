#include <iostream>
#include <list>
using namespace std;

int main()
{
    string s;
    cin >> s;
    list<char> L;
    for(auto c : s) L.push_back(c);
    
    auto coursor = L.end();
    int n;
    cin >> n;
    while(n--){
        char key;
        cin >>key;
        if(key == 'L'){
            if(coursor != L.begin()) coursor--;
        }
        else if (key =='D'){
            if(coursor != L.end()) coursor++;
        }
        else if (key =='P'){
            char add;
            cin >> add;
            L.insert(coursor,add);
        }
        else{
            if(coursor != L.begin()){
                coursor--;
                coursor = L.erase(coursor);
            }
        }
    }
    
    for(auto c : L)
        cout << c;

    return 0;
}