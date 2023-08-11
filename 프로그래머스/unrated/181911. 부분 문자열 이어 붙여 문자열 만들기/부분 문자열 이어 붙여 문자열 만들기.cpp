#include <string>
#include <vector>

using namespace std;

string solution(vector<string> my_strings, vector<vector<int>> parts) {
    string answer = "";
    for(int i = 0; i < my_strings.size(); i++){
        int first = parts[i][0];
        int last = parts[i][1];
        
        string sub_string = my_strings[i].substr(first, last - first +1);
        answer += sub_string;
    }
    
    return answer;
}