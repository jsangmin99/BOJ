#include <string>
#include <vector>

using namespace std;

string solution(string my_string, vector<vector<int>> queries) {
    string answer = "";
    for(const vector<int> &q : queries){
        int a = q[0];
        int b = q[1];
        while (a < b) {
            swap(my_string[a], my_string[b]);
            a++;
            b--;
        }
    }
    answer = my_string;
    return answer;
}