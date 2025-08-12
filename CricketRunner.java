class CricketRunner {
public static void main(String[] args) {
int ticketPrice = Cricket.getMatchTicketPrice();
System.out.println("Match Ticket Price = " + ticketPrice);

int foodPrice = Cricket.getFoodPrice();
System.out.println("Food Price = " + foodPrice);

int beveragePrice = Cricket.getBeveragePrice();
System.out.println("Beverage Price = " + beveragePrice);

int merchandisePrice = Cricket.getMerchandisePrice();
System.out.println("Merchandise Price = " + merchandisePrice);

int parkingFee = Cricket.getParkingFee();
System.out.println("Parking Fee = " + parkingFee);
    }
}