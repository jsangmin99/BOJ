#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<string> picture, int k) {
    vector<string> answer;
    for(const string& row : picture){
        string temp;
        for(char kan : row){
            for(int i =0; i < k; i++){
                temp += kan;
            }
        }
        for(int i =0; i<k ; i++){
            answer.push_back(temp);
        }
    }
    return answer;
}