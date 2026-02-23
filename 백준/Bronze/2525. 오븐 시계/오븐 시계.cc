#include <iostream>

using namespace std;

int main(int argc, char const* argv[]){

    ios_base::sync_with_stdio(false);

    int a, b, c;
    cin >> a >> b >> c;

    int min, hour, minute;

    min = a * 60 + b;
    min += c;

    hour = (min / 60) % 24;
    minute = min % 60;

    cout << hour << " " << minute;
        
    return 0;
}