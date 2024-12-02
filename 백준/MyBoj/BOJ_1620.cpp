// 나는야 포켓몬 마스터 이다솜
#include<iostream>
#include<map>
#include<string>
using namespace std;
int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int n, m;
    map<string, int> poketmon_str;
    map<int, string> poketmon_num;
    string name;
    cin >> n >> m;
    for(int i =1; i <= n; i++){
        cin >> name;
        poketmon_str.insert(make_pair(name,i));
        poketmon_num.insert(make_pair(i, name));
    }

    for (int i = 0; i < m; i++)
    {
        char quest[21];
        cin >>quest;
        if (quest[0] >= 'A'){
            cout << poketmon_str[quest] << "\n";
        }else{
            int num = atoi(quest);
            cout << poketmon_num[num] << "\n";
        }
        
    }    
}