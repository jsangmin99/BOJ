#include <iostream>
#include <unordered_map>
#include <string>
#include <vector>

using namespace std;

bool canPronounce(string babbling) {
    unordered_map<string, bool> m;
    m["aya"] = true;
    m["ye"] = true;
    m["woo"] = true;
    m["ma"] = true;

    for (int j = 0; j < babbling.size(); ) {
        if (babbling.substr(j, 3) == "aya" && m["aya"]) {
            j += 3;
            m["aya"] = false;
            m["ye"] = true;
            m["woo"] = true;
            m["ma"] = true;
        } else if (babbling.substr(j, 2) == "ye" && m["ye"]) {
            j += 2;
            m["aya"] = true;
            m["ye"] = false;
            m["woo"] = true;
            m["ma"] = true;
        } else if (babbling.substr(j, 3) == "woo" && m["woo"]) {
            j += 3;
            m["aya"] = true;
            m["ye"] = true;
            m["woo"] = false;
            m["ma"] = true;
        } else if (babbling.substr(j, 2) == "ma" && m["ma"]) {
            j += 2;
            m["aya"] = true;
            m["ye"] = true;
            m["woo"] = true;
            m["ma"] = false;
        } else {
            return false;
        }
    }

    return true;
}

int solution(vector<string> babbling) {
    int answer = 0;

    for (const string& word : babbling) {
        if (canPronounce(word)) {
            answer++;
        }
    }

    return answer;
}

int main() {
    vector<string> babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
    cout << solution(babbling) << endl;
}
