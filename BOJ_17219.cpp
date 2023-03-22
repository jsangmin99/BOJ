//비밀번호 찾기
#include<iostream>
#include<map>
using namespace std;
int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    int N,M;
    string id, password;
    map<string,string> dic;
    cin >> N >> M;
    for(int i=0; i< N; i++){
        cin >> id >> password;
        dic[id] = password;
    }
    for(int i =0; i< M; i++){
        cin >> id;
        cout << dic[id]<< "\n";
    }
}