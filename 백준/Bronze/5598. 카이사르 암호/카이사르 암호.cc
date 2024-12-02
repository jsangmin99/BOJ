#include <iostream>
#include <string>
using namespace std;

int main() {
    string word;
    cin >> word;

    for (char& c : word) {
        if (isalpha(c)) {
            c = (c - 'A' + 23) % 26 + 'A';  // 3칸씩 뒤로 이동
        }
    }
    cout << word << "\n";
}
