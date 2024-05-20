#include <string>
#include <vector>

using namespace std;
int answer =0;
string aeiou = "AEIOU";
string target = "";
int cnt = -1;

void find_dic(string word){
    cnt++;
    if (word == target) {
        answer = cnt;
        return;
    }

        
    if(word.size() >= 5) return;
    for(int i = 0; i < aeiou.size(); i++){
        find_dic(word + aeiou[i]);
    }
    
}

int solution(string word) {
    target = word;
    find_dic("");
    
    
    return answer;
}
/*
    'AAAAE'
    A
    AA
    AAA
    AAAA
    AAAAA
    AAAAE
    
    AAAE
    A
    AA
    AAA
    AAAA
    AAAAA
    AAAAE
    AAAAI
    AAAAO
    AAAAU
    AAAE
    */
    
    // 1. 자리수를 기준으로 시작을 정해야 할듯
    // 5자리면 5부터시작 AEIOU
    // 4자리면 9 부터 시작