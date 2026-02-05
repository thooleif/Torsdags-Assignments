void main(){

    //Opgave 1
    double totalPrice = 1880;
    double finalPrice = 0;

    if(totalPrice > 1000){
        finalPrice += totalPrice * 0.80;
    } else{
        System.out.println("No discount");
    }

    System.out.println("Final price: " + finalPrice + "kr");

    //Opgave 2
    int hour = 14;

    if(hour >= 5 && hour <= 11) {
        System.out.println("Good morning!");
    }else if(hour >= 12 && hour <= 17){
        System.out.println("Good afternoon!");
    }else if(hour >= 18 && hour <= 21){
        System.out.println("Good evening!");
    }else if(hour >= 22 && hour <= 4){
        System.out.println("Good night!");
    }

    //Opgave 3
    int ageLimit = 15;
    int guestAge = 14;
    boolean hasParentalConsent = true;

    if(guestAge >= ageLimit || (guestAge >= 13 && hasParentalConsent)){
        System.out.println("Can watch the movie!");
    }else {
        System.out.println("Cannot watch the movie!");
    }

    //Opgave 4
    int age = 22;
    boolean hasAccidents = false;
    int accidents = 0;
    boolean riskZone = false;

    int basisPremium = 5000;
    int premium;

    if((age < 25 || age > 70) || (!hasAccidents && accidents > 2) || !riskZone){
        premium = basisPremium + 2000;
        System.out.println("High risk category!");
    }else{
        premium = basisPremium;
        System.out.println("Standard risk category!");
    }
    System.out.println("Annual premium: " + premium + "kr");

    //Opgave 5
    String item = "Pizza";
    int quantity = 2;
    double price;

    switch(item){
        case "Burger":
            price = 89;
            break;
        case "Pizza":
            price = 95;
            break;
        case "Salad":
            price = 65;
            break;
        case "Pasta":
            price = 79;
            break;
        case "Steak":
            price = 145;
            break;
        default:
            price = 0.0;
            System.out.println("No item has been picked");
    }

    double totalPrice1 = price * quantity;

    System.out.println("The price of your order is: " + totalPrice1 + "kr");

    //Opgave 6
    int savings = 0;
    int monthlySaving = 500;
    int months = 0;

    while(savings < 10000){
        savings += monthlySaving;
        months++;
    }
    System.out.println("You now have: " + savings + "kr. After saving up for " + months + " months!");

    //Opgave 7
    int monthlySavings = 1000;
    int total = 0;

    for(int month = 1; month <=12; month++){
        total += monthlySavings;
        System.out.println("Month: " + month + " " + total + "kr");
    }
    System.out.println("Total after 1 year: " + total + "kr");

    //Opgave 7
    int[] temps = {18, 22, 20, 25, 19, 21, 23};
    String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    int sum = 0;
    for(int i = 0; i < temps.length; i++){
        sum += temps[i];
    }
    double average = (double) sum / temps.length;

    int hottestIndex = 0;
    int coldestIndex = 0;
    for(int i = 1; i < temps.length; i++){
        if (temps[i] > temps[hottestIndex]){
            hottestIndex = i;
        }
        if (temps[i] < temps[coldestIndex]){
            coldestIndex = i;
        }
    }

    int countAbove20 = 0;
    for(int i = 0; i < temps.length; i++){
        if(temps[i] > 20){
            countAbove20++;
        }
    }

    System.out.println("Average: " + average + "C");
    System.out.println("Hottest: " + days[hottestIndex] + " (" + temps[hottestIndex] + "C)");
    System.out.println("Coldest: " + days[coldestIndex] + " (" + temps[coldestIndex] + "C)");
    System.out.println("Days above 20C: " + countAbove20);

    //Opgave 8
    double[] prices = {299.0, 149.0, 899.0, 49.0};
    double totals = 0.0;

    for(double price1 : prices){
        totals += price1;
    }
    System.out.println("Total: " + totals + "kr");
}