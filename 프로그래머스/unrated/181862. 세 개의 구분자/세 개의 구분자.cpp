#include <string>
#include <vector>

using namespace std;

vector<string> solution(string myStr) {
    vector<string> result;
    string current = "";

    for (char c : myStr) {
        if (c == 'a' || c == 'b' || c == 'c') {
            if (!current.empty()) {
                result.push_back(current);
                current = "";
            }
        } else {
            current += c;
        }
    }

    if (!current.empty()) {
        result.push_back(current);
    }

    if (result.empty()) {
        result.push_back("EMPTY");
    }

    return result;
}