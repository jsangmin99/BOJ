#include <iostream>;
using namespace std;
int main(){
    //주어진 알파벳이 N 또는 n 이면 "Naver D2", 아니라면 "Naver Whale"을 따옴표를 제외하고 출력한다.
    char c;
    cin >> c;
    if(c == 'N' || c =='n'){
        cout << "Naver D2";
    }else{
        cout << "Naver Whale";
    }
}