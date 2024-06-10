#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    unordered_map<string, int> umap;
    string answer = "";
    for(auto a : participant){
        if(umap.end() == umap.find(a)){
             umap.insert(make_pair(a, 1));
        }else{
            umap[a]++;
        }
    }
    for (auto a : completion)
        umap[a]--;

    for(auto a : participant)
        if (umap[a] > 0)
        {
            answer = a;
            break;
        }

    return answer;
}