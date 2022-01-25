//랜선자르기
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main(){
    int k, n, x;
    vector<long long>arr; //나눠줘야 되므로 long long 타입
    cin >> k >> n;


    for (int i = 0; i < k; i++){ //백터에 값넣어주기
        cin >> x;
        arr.push_back(x);
    }

    long long max = *max_element(arr.begin(),arr.end()); //나눠줘야 되므로 long long 타입
    long long mid;
    long long min = 1;
    long long result = 0;

    while (min <= max){
        long long count = 0;
        mid = (max + min) / 2;

        for (int i = 0; i < k; i++){ //중간값으로 나눴을떄의 개수
            count += arr[i]/mid;
        }
        if(count < n){  //계산한 개수가 주어진 수보다 작다면(작게 자른 경우)
            max = mid -1; //최대값을 중간 값보다 1 작개하여 밑의수를 구함
        
        }else{          //계산한값이 작지 않다면
            result = mid;  //결과값은 중간값
            min = mid +1;  //(while로 돌아갔을떄 크게 자른 경우를 확인)
        }
    }
    cout << result;
    return 0;
}