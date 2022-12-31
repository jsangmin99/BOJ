#include <iostream>
#include <time.h>


using namespace std;

int main()
{
    struct tm*t;
    time_t timer = time(NULL);
    t = localtime(&timer);
    printf("%d\n", t->tm_year + 1900);
    printf("%d\n", t->tm_mon + 1);
    printf("%d\n", t->tm_mday);



    return 0;
}