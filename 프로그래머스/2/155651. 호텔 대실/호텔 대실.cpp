#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<string>> book_time) {
    int answer = 0;
    int room[2410]={0,};
    
    for(int i=0;i<book_time.size();i++)
    {
        //문자열 숫자로 변환
        int start = stoi(book_time[i][0].substr(0,2))*100 + stoi(book_time[i][0].substr(3)); //시작시간 
        int end = stoi(book_time[i][1].substr(0,2))*100 + stoi(book_time[i][1].substr(3)) + 10; // 끝시간+청소시간
        if(end % 100 >= 60) //초과할경우 시간 단위 + 1
            end += 40;
        for(int j=start;j<end;j++) 
            room[j]++;
    }
    for(int i=0;i<2400;i++) answer = max(answer, room[i]);//타임 테이블이 겹치는곳이 최대인곳(구글 캘린더 같이)
    return answer;
}