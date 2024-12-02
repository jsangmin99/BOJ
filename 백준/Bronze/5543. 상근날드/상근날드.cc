#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int burger_prices[3];
    int drink_prices[2];

    for (int i = 0; i < 3; i++) {
        cin >> burger_prices[i];
    }

    for (int i = 0; i < 2; i++) {
        cin >> drink_prices[i];
    }

    int min_burger_price = *min_element(burger_prices, burger_prices + 3);
    int min_drink_price = *min_element(drink_prices, drink_prices + 2);

    int cheapest_set_menu = min_burger_price + min_drink_price - 50;

    cout << cheapest_set_menu << endl;

    return 0;
}