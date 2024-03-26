#include <iostream>
#include <vector>
using namespace std;

vector<int> temp, numbers;

void merge(vector<int>& arr, int first, int middle, int last);
void merge_sort(vector<int>& arr, int first, int last) {
    if (first < last) {
        int middle = ((first + last) / 2);
        merge_sort(arr, first, middle);
        merge_sort(arr, middle + 1, last);
        merge(arr, first, middle, last);
    }
}

void merge(vector<int>& arr, int first, int middle, int last) {
    int i = first, j = middle + 1;
    while (i <= middle && j <= last) {
        if (arr[i] <= arr[j]) {
            temp.push_back(arr[i++]);
        }
        else {
            temp.push_back(arr[j++]);
        }
    }

    while (i <= middle) {
        temp.push_back(arr[i++]);
    }

    while (j <= last) {
        temp.push_back(arr[j++]);
    }

    i = first;
    for (int k = 0; k < temp.size(); ++k) {
        arr[i++] = temp[k];
            numbers.push_back(arr[i - 1]);
    }
    temp.clear(); 
}

int main() {
    int N = 0, K = 0;

    cin >> N >> K;
    vector<int> arr(N);

    for (int i = 0; i < N; i++) {
        cin >> arr[i];
    }

    merge_sort(arr, 0, N - 1);
    if (K <= numbers.size())
        cout << numbers[K - 1]; 
    else
        cout << -1;

    return 0;
}
