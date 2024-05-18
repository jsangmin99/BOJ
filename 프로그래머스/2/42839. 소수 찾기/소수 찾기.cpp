#include <iostream>
#include <vector>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

set<int> combineArr;
//1, 7
//0,1,1 => 01,11,101
void makeCombine(string combines, string others){
    // 새로운 경우의수 넣기
    if(combines != ""){
        combineArr.insert(stoi(combines));
    }
    //기존 경우의수 + 새로운 값
    for (int i = 0; i < others.size(); i++)
        makeCombine(combines + others[i], others.substr(0, i) + others.substr(i + 1));
}
bool isPrime(int number){
    if (number == 0 || number == 1)
        return false;
    
    for (int i = 2; i <= sqrt(number); i++)
        if (number % i == 0)
            return false;

    return true;
}

int solution(string numbers) {
    int answer = 0;
    // 1. 모든 경우의 수를 만든다
    makeCombine("", numbers);
    // 2. 소수인지 판별하고 개수를 +1 한다.
    for(int i : combineArr){
        if(isPrime(i)){
            answer++;
        }
    }
    return answer;
}