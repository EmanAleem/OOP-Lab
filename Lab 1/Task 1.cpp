#include <iostream>
using namespace std;
double kmToMiles(double kilometers) {
    return kilometers * 0.621;
}
double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
}
double time(int sec) {
	int h,m,s;
     h=sec/3600;
    m=(sec%3600)/60;
    s=(sec%3600)%60;
    cout<<h<<" Hours "<<m<<" Mintues "<<s<<" Seconds ";
    
}

int main() {
    int choice;
    double input;   
    cout << "Select a conversion type:" << endl;
    cout << "1. Kilometers to Miles" << endl;
    cout << "2. Celsius to Fahrenheit" << endl;
    cout << "3. Seconds to Hours, Minutes & Seconds" << endl;
    cout << "Enter your choice (1-3): ";
    cin >> choice;
    switch(choice) {
        case 1:
            cout << "Enter distance in kilometers: ";
            cin >> input;
            cout << input << " kilometers is equal to " << kmToMiles(input) << " miles." << endl;
            break;
        case 2:
            cout << "Enter temperature in Celsius: ";
            cin >> input;
            cout << input << " Celsius is equal to " << celsiusToFahrenheit(input) << " Fahrenheit." << endl;
            break;
        case 3:
            cout << "Enter seconds: ";
            cin >> input;
            cout <<"Time is equal to " << time(input)<< endl;
            break;
        
        default:
            cout << "Invalid choice!" << endl;
    }

    return 0;
}
