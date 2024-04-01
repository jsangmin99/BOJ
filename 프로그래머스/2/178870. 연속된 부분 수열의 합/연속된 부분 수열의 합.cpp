#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> sequence, int k) {

    vector<int> answer;
    
    int s_size = sequence.size();
    int sum = 0;
    int minVal = s_size;
    pair<int, int> candidate = {0, s_size - 1};

    int start = 0, end = 0;
    while (start < s_size) {
        if (sum == k && (end - start) < minVal) {
            candidate.first = start;
            candidate.second = end - 1;
            minVal = (end - start);
        } else if (sum < k && end < s_size) {
            sum += sequence[end++];
        } else {
            sum -= sequence[start++];
        }
    }

    answer.push_back(candidate.first);
    answer.push_back(candidate.second);
    return answer;
}