#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int n;
    double a,b,c;
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> a >> b >> c;
        cout <<fixed;
        cout.precision(2);
        cout <<"$" <<round((a*b*c)*100)/100 << "\n";
    }

}