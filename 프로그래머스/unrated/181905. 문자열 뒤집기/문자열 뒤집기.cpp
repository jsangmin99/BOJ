#include <string>
#include <vector>

using namespace std;

string solution(string my_string, int s, int e) {
    string answer = "";
    for(int i = s, j = e; i < j ; i++, j--){
        swap(my_string[i], my_string[j]);
    }
    answer = my_string;
    return answer;
}