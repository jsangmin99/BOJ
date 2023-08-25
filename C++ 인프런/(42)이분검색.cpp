#include<iostream>
using namespace std;
int main(){
    int N,M, rt=0, lt=0,mid=0;
    int temp;
    vector<int> vec;

    cin >> N >> M;

    for(int i =0; i < N; i++){
        temp =0;
        cin >> temp;
        vec.push_back(temp);
    }
    sort(vec.begin(), vec.end());

    rt=N-1;
	while(lt<=rt){
		mid=(lt+rt)/2;
		if(vec[mid]==M){
            cout << mid+1;
			return 0;
		}
		else if(vec[mid]>=M) rt=mid-1;
		else lt=mid+1;
	}

}