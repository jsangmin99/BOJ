#include <string>
#include <vector>

using namespace std;

int solution(int chicken) {
    int answer = 0;
    int coupon = 0;
    while(chicken){
        answer += chicken / 10;
        coupon += chicken % 10;
        chicken = chicken/10;
        if(coupon >=10){
            answer += coupon /10;
            coupon += coupon /10;
            coupon = coupon %10;
        }
    }
    return answer;
}