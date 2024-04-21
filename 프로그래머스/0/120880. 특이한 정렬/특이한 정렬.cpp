#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int temp;
 
bool compare(int a, int b)
{
    int num1 = abs(temp - a);
    int num2 = abs(temp - b);
    
    // 만약 두 수가 같다면 내림차순
    if (num1 == num2)
        return a > b;
    
    // n과 가까운 순서대로 정렬
    return num1 < num2;
}
 
vector<int> solution(vector<int> numlist, int n) {
    temp = n;
    sort(numlist.begin(), numlist.end(), compare);
    
    return numlist;
}
