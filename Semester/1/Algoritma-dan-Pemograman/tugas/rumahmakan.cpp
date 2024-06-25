// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;

void banner() {
    string arr[] = {"Nasi Goreng", "Ayam Geprek", "Soto Babat", "Mie Ayam", "Mie Bakso", "Seblak"};
    string pilihanMenu;
    int arrSize = sizeof(arr) / sizeof(arr[0]);
    for (int i = 0; i < arrSize; i++) {  // Changed <= to <
        pilihanMenu += to_string(i + 1) + ". " + arr[i] + "\n";
    }
    string menu = ":::::Menu:::::\n" + pilihanMenu + "0. Keluar\n\n";
    cout << menu;
}

int main() {
    banner();
    bool stat = true;
    int opsi;
    while (stat) {
        cout << "Silahkan masukan menu: ";
        cin >> opsi;
        switch (opsi) {
            case 1: {
                cout << "Mantap\n";
                break;
            }
            case 0: {
                stat = false;
                break;
            }
            default: {
                cout << "Tidak ada dalam menu\n";
            }
        }
    }
    return 0;
}