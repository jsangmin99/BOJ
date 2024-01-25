#include <iostream>
#include <string>
#include <vector>

using namespace std;

string case1(string str){
    for(char& c : str){
        if(isalpha(c)){
            c = tolower(c);
        }
    }
    return str;
}

string case2(string str) {
    string result;
    for (char c : str) {
        if(isalpha(c) || isdigit(c) || c == '-' || c == '_' || c == '.') {
            result += c;
        }
    }
    return result;
}

string case3(string str){
    string result="";
    for (char c : str) {
        if(c == '.' && result.back() == '.') continue;
        result += c;
    }
    return result;
}

//4단계 아이디의 처음에 위치한 '.'가 제거되었습니다.
//".bat.y.abcdefghijklm" → "bat.y.abcdefghijklm"
string case4(string str){
    if(str.front() == '.') str.erase(0, 1);
    if(str.back() == '.') str.pop_back();
    return str;
}
    
//5단계 아이디가 빈 문자열이 아니므로 변화가 없습니다.
//"bat.y.abcdefghijklm" → "bat.y.abcdefghijklm"

string case5(string str){
    if (str.empty()) str.push_back('a');
    return str;
}

//6단계 아이디의 길이가 16자 이상이므로, 처음 15자를 제외한 나머지 문자들이 제거되었습니다.
//"bat.y.abcdefghijklm" → "bat.y.abcdefghi"

string case6(string str){
    if(str.length() >= 16) str.erase(str.begin()+15, str.end());
    if(str.back() == '.') str.pop_back();
    return str;
}
//7단계 아이디의 길이가 2자 이하가 아니므로 변화가 없습니다.
//"bat.y.abcdefghi" → "bat.y.abcdefghi"

string case7(string str){
    while(str.length() < 3) {
        str += str.back();
    }
    return str;
}
string solution(string new_id) {
    string answer = "";
    answer = case7(case6(case5(case4(case3(case2(case1(new_id)))))));
    cout << answer;
    return answer;
}

