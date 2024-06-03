#include <iostream>
using namespace std;
int main() {
    // operator [+ - * / % ++ --] arithmetic
    int num1 = 10, num2 = 10;
    cout << num1 + num2; //20
    cout << num1 - num2; //0
    cout << num1 / num2; //1
    cout << num1 * num2; //100

    // operator [= += -= *= /= %= &= |= ^= >>= <<=] assignment
    num1 += 2;

    // operator [== != > < >= <=] comparsion
    cout << (num1 <= num2);

    // operator [&& || !] logical
    cout << !(num1 < 5 && num2 < 10);
    return 0;
}