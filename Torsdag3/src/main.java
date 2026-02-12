void main() {

    int a = 7, b = 42;
    int smaller = minimum(a,b); //tilføjet variablen "int smaller" så if statement kan bruges

    if (smaller == a) { //Lavet "{}" om til "()" da det er en condition
        System.out.println(smaller + " is the smallest!"); //tilføjet "smaller +" så det rigtige bliver printet ud
    }
}

int minimum(int a, int b) { //Ændret void til int da den ellers ikke vil return
    int smaller = 0; //Tilføjet "int smaller = 0;" for at variablen er initialiseret
    if (a < b) {
        smaller = a;

    } else if(a >= b) { //Mangler et "if" da der ikke kan være en condition i "else"
        smaller = b;
    }
    return (int) smaller; //har tilføjet "()" rundt om int
}
