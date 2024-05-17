#include <vector>
#include <algorithm>
using namespace std;

/*
N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아,
그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.

그러면? 
- n/2 를 구함
- 중복 제거
- 중복제거한 개수가 n/2 보다 크면 n/2
						작으면 중복제거한 개수

*/
int solution(vector<int> nums)
{
    int answer = 0;
    int M = nums.size();
    int half = (M/2);
    sort(nums.begin(), nums.end());
    nums.erase(unique(nums.begin(),nums.end()),nums.end());
    
    int kind = nums.size();
    
    if(kind <= half ){
        answer = kind;
    }else if(kind > half){
        answer = half;
    }
    
    return answer;
}
