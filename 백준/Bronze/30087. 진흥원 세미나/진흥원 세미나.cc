#include <iostream>
#include <map>
using namespace std;

int main() {
    map<string, string> M;
    M.insert({ "Algorithm", "204" });
	M.insert({ "DataAnalysis", "207" });
    M.insert({ "ArtificialIntelligence", "302" });
    M.insert({ "CyberSecurity", "B101" });
    M.insert({ "Network", "303" });
    M.insert({ "Startup", "501" });
    M.insert({ "TestStrategy", "105" });

    int T;
    cin >> T;
    for(int i = 0; i < T; i++){
        string tmp = "";
        cin >> tmp;
        cout << M.find(tmp) -> second << "\n";
    }

    
    
    return 0;
}
