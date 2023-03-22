#include <iostream>
#include <time.h>
using namespace std;

int main(){
time_t Timer = time(NULL);
struct tm *t = localtime(&Timer);

   cout<<t->tm_year + 1900<<"-";
    cout.width(2);
    cout.fill('0');
    cout<<t->tm_mon + 1<<"-";
    cout.width(2);
    cout.fill('0');
    cout<<t->tm_mday;
    return 0;
}