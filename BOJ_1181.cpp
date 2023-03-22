#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
bool SameLength(string a, string b){
    if(a.length()==b.length())
        return a<b;
    return a.length()<b.length();
}
int main(){
    int n;
    vector<string> v;
    cin>>n;
    for(int i=0; i<n; i++){
        string word;
        cin >> word;
        if(find(v.begin(),v.end(),word)==v.end())
            v.push_back(word);
    }
    sort(v.begin(), v.end(), SameLength);

    for(int i=0; i<v.size(); i++){
        cout<<v[i]<<"\n";
    }
}