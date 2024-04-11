#include <string>
#include <vector>
#include <map>
#include <sstream>

using namespace std;

vector<string> solution(vector<string> record) {
    //채팅방에서 닉네임을 변경하는 방법은 다음과 같이 두 가지이다.
    // 1. 나갔다가 새로운닉네임으로 들어오는것
    // 2. 채팅방 안에서 닉네임을 변경하는 것
    // Enter / 아이디 / 이름
    // Change/ 아이디 / 이름
    // Leave / 아이디
    vector<string> answer;
    map<string, string> id_name;
    vector<pair<string,string>> result;

    for (int i = 0; i < record.size();i++) {
		string commend, id, name;
		stringstream sstream;
		sstream.str(record[i]);
		sstream >> commend >> id >> name;
		
		if (commend == "Enter") {
			id_name[id] = name;
			result.push_back(make_pair(id, "들어왔습니다."));
		}else if(commend =="Change"){
			id_name[id] = name;
        }else if(commend == "Leave")
			result.push_back(make_pair(id, "나갔습니다."));
    }
    for (int i = 0; i < result.size();i++) {
		answer.push_back(id_name[result[i].first] + "님이 " + result[i].second);
	}
    return answer;
}