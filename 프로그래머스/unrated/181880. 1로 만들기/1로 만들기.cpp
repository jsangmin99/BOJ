#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int total_count = 0;
    for(int i : num_list){
        int count = 0;
        while(i != 1){
            if(i % 2 == 0){
                i /= 2;
            	count++;
            }else{
                i -= 1;
            }
            
        }
        total_count += count;
    }
    return total_count;
}