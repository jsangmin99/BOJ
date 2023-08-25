#include<iostream>
using namespace std;
int main(){
    vector<int> vec;
    vector<int> result;
    int n;
    cin >> n;
    for(int i = 0; i < n; i++){
        int temp = 0;
        cin >> temp;
        vec.push_back(temp);
    }

    for(int i = n; i > 0; i--){
        if(vec[i-1] == 0){
            result.insert(result.begin(), i);
        }
        else {
            result.insert(result.begin()+vec[i-1], i);
        }
    }

    for(int i = 0; i < n; i ++){
        cout << result[i] << " ";
    }
}