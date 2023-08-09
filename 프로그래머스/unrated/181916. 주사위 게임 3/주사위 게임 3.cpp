#include <string>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int solution(int a, int b, int c, int d) {
    int answer = 0;
    vector<int> n{a,b,c,d};
    sort(n.begin(), n.end()); 
    
    if(n[0] == n[1] && n[1] == n[2] && n[2] == n[3]){
        answer = n[1] * 1111;
        
    }else if(n[0] == n[1] && n[2] == n[3] ){
        answer = (n[2] + n[0]) * abs(n[2] - n[0]);
        
	}else if(n[1] == n[2] && (n[0] == n[1] || n[2] == n[3])){
        int temp = 10 * n[1] + (n[0] != n[1] ? n[0] : n[3]);
        answer = pow(temp, 2);
        
    }else if(n[0] != n[1] && n[1] != n[2] && n[2] != n[3]){
        answer = n[0];
    }
    
    else{
        if (n[0] == n[1]) {
        	answer = n[2] * n[3];
    	} else if (n[1] == n[2]) {
        	answer = n[0] * n[3];
    	} else {
        	answer = n[0] * n[1];
    	}
    }
    return answer;
}