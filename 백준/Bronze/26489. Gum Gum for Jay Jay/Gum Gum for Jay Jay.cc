#include <iostream>
using namespace std;

int main()
{
   string a;
   int n=0;
 
   while(true) {
        getline(cin,a);
        if(cin.eof() == true) break;
        n++;
   }
   cout << n;
}
