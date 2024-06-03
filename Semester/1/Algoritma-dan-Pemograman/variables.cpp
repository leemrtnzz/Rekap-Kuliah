#include <iostream>
using namespace std;
int main() {
    // type variableName = value;

    string name = "Muhammad Ichsan Haekal";
    int age = 22;
    float nilai = 99.9;
    bool isStudent = true;
    string address, kecamatan; //Multiple variables
    address = "Jl. Ciekek Pabuaran";
    kecamatan = "Karaton";

    const string fullName = "Muhammad Ichsan Haekal";
    // fullName = "budi"; //error, karena fullName adalah const, tidak bisa di ubah
    return 0;
}

