#include <string>
#include <vector>

using namespace std;

int solution(string my_string, string is_suffix) {
    int my_len = my_string.size();
    int suffix_len = is_suffix.size();
    
    if (my_len < suffix_len) {
        return 0;
    }
    
    for (int i = 0; i < suffix_len; ++i) {
        if (my_string[my_len - suffix_len + i] != is_suffix[i]) {
            return 0; 
        }
    }
    
    return 1;
}