#include<iostream>
#include<deque>
#include<algorithm>
using namespace std;
int main(){
    int s,n;

    cin >> s >> n;

    deque<int> cache;

    for (int i = 0; i < n; ++i) {
        int temp;
        cin >> temp;

        auto it = find(cache.begin(), cache.end(), temp);

        if (it != cache.end()) {
            cache.erase(it);
        } else {
            if (cache.size() >= s) {
                cache.pop_back();
            }
        }

        cache.push_front(temp);
    }
    for(int i =0;i < s; i++){
        cout << cache[i] << " ";
    }
}