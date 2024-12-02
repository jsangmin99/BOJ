#define _USE_MATH_DEFINES
#include <iostream>
#include<math.h>
using namespace std;

int main(){
    int r;
    double pi= M_PI;
    double ucl;
    double taxi;
  cin>>r;
ucl=pi*r*r;
taxi=2*r*r;

cout<<fixed;
cout.precision(6);
cout<<ucl<<"\n"<<taxi;
}   