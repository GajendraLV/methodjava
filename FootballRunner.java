class FootballRunner {
public static void main(String[] args) {
int ticket = Football.ticketPrice();
System.out.println("Ticket Price = " + ticket);

int jersey = Football.jerseyPrice();
System.out.println("Jersey Price = " + jersey);

int snack = Football.snackPrice();
System.out.println("Snack Price = " + snack);

int drink = Football.drinkPrice();
System.out.println("Drink Price = " + drink);

int parking = Football.parkingFee();
System.out.println("Parking Fee = " + parking);
    }
}