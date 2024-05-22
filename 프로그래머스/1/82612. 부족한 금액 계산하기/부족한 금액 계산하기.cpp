#include <iostream>
#include <cmath>
using namespace std;

long long solution(int price, int money, int count)
{
    long long answer = -1;
    long long total_money = 0;
    for(int i = 1 ; i <= count; i++){
        total_money += price * i;
    }
    if(total_money<=money)
	    answer=0;
    else
	    answer=abs(money-total_money);
    return answer;
}