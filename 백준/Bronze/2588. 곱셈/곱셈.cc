# include <iostream>
# include <cstdlib>


int main(int argc, char const *argv[]){
    int a;
    char b[4];

    std::cin >> a;
    std::cin >> b;

    std::cout << a * (b[2] - '0') << "\n";
    std::cout << a * (b[1] - '0') << "\n";
    std::cout << a * (b[0] - '0') << "\n";
    std::cout << a * std::atoi(b) << "\n";

    return 0;
}