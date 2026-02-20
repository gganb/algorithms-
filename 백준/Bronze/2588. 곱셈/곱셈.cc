# include <iostream>
# include <cstdlib>


int main(int argc, char const *argv[]){
    int a,b;

    std::cin >> a >> b;
    
    std::cout << a * (b % 10) << "\n";
    std::cout << a * ((b % 100) / 10) << "\n";
    std::cout << a * (b / 100) << "\n";
    std::cout << a * b;

    return 0;
}