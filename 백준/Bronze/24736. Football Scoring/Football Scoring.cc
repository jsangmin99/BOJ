#include <iostream>

using namespace std;

int cal(){
    int a1 =0,a2=0, a3=0, a4=0, a5=0;
    cin >> a1 >> a2 >> a3 >> a4 >> a5;
    return (a1*6 + a2*3 + a3*2+ a4 + a5*2);


}

int main()
{
    int a,b;
    a = cal();
    b = cal();
    cout << a << " " << b;
    return 0;
}
