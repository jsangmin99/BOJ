#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
int n,x,cnt=0;
vector<pair<int,int>>v,z;
cin>> n;
for(int i=0; i <n;i++){
    cin>>x;
    v.push_back({x,i});
}
//기존 정렬순서
sort(v.begin(),v.end());//정렬
z.push_back({v[0].second, 0});

for(int i=1; i<n;i++){
    if(v[i-1].first == v[i].first){
        z.push_back({v[i].second,cnt});
    }else{
        z.push_back({v[i].second,++cnt});
    }
}
sort(z.begin(),z.end());

for(int i=0; i < n; i++){
    cout << z[i].second<< " ";
}

}