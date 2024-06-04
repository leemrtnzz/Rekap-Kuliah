#include <iostream>
using namespace std;

int main() {
    int t, l;
    cout << "Masukan input tinggi: "; cin >> t;
    cout << "Masukan input lebar: "; cin >> l; cout << endl;
    char pagar = '#';
    for(int i = 1; i <= t; i++){
        for (int j = 1; j <= l; j++){
            cout << pagar;
        }
        cout << endl;
        
    }
    return 0;
}

/*
Output:

Masukan input tinggi: 10
Masukan input lebar: 10

##########
##########
##########
##########
##########
##########
##########
##########
##########
##########
*/