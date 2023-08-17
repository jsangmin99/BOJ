#include <string>
#include <vector>

using namespace std;

int solution(vector<string> order) {
    int lowPrice = 4500;
    int highPrice = 5000;
    int totalAmount = 0;
    
    for (string drink : order) {
        if (drink.find("iceamericano") != string::npos || drink.find("americanoice") != string::npos ||
            drink.find("hotamericano") != string::npos || drink.find("americanohot") != string::npos ||
            drink.find("anything") != string::npos || drink.find("americano") != string::npos ) {
            totalAmount += lowPrice;
        } else if (drink.find("icecafelatte") != string::npos || drink.find("cafelatteice") != string::npos ||
                   drink.find("hotcafelatte") != string::npos || drink.find("cafelattehot") != string::npos||
                  drink.find("cafelatte") != string::npos) {
            totalAmount += highPrice;
        }
    }
    
    return totalAmount;
}