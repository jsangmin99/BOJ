#include <iostream>
using namespace std;

int main()
{
    int cnt;
    string s;
    
    while (true){
        cnt =0;
        getline(cin,s);
        if(s[0] == '#') break;
        for (int i = 0; i < s.size(); i++) {
            if(s[i] == 'A') cnt++;
            if(s[i] == 'a') cnt++;
            if(s[i] == 'E') cnt++;
            if(s[i] == 'e') cnt++;
            if(s[i] == 'I') cnt++;
            if(s[i] == 'i') cnt++;
            if(s[i] == 'O') cnt++;
            if(s[i] == 'o') cnt++;
            if(s[i] == 'U') cnt++;
            if(s[i] == 'u') cnt++;
        }
        cout << cnt <<"\n";
    }
}