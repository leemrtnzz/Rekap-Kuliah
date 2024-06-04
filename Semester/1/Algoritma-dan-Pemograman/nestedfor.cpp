#include <iostream>
using namespace std;

int main() {
    for (int i = 1; i<=10; i++) {
        for (int j = 1; j <= 10; j++){
            cout << j << ' ';
            if (j == 10) {
                cout << endl;
            }
        }
    }
    return 0;
}
// Output:
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 