#include <string>
#include <vector>
#include <sstream>

using namespace std;

string solution(string polynomial) {
    string answer = "";
    vector<string> s_list;
    stringstream ss(polynomial);
    string temp = "";
    int x =0, n =0;
    while(ss >> temp) s_list.push_back(temp);
    
    for(int i = 0; i < s_list.size(); i++){
        if(s_list[i][s_list[i].size() - 1] == 'x') {
            if(s_list[i].size() == 1) x += 1; //x만 있을때
            else x += stoi(s_list[i].substr(0, s_list[i].size() - 1));//x 앞에 숫자가 있을때
        }
        else if(s_list[i] == "+") continue;
        else n += stoi(s_list[i]);
    }
    if(x != 0){
        if(x == 1) answer += "x";
        else answer += to_string(x) + "x";
    }
    if(n != 0){
        if(answer != "") answer += (" + " + to_string(n));
        else answer += to_string(n);
    }
    return answer;
}