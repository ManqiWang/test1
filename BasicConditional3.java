/**
 This program asks the user to enter in a number, 1 through 12, then prints the corresponding month.
 */
public class BasicConditional3 {
  public static void main(String[] args){
    System.out.println("Please enter a number, 1 through 12:");
    String month = TextIO.getln();
    System.out.println("");
    switch (month) {
      case "1": System.out.println("You entered in January!"); break;
      case "2": System.out.println("You entered in February!"); break;
      case "3": System.out.println("You entered in March!"); break;
      case "4": System.out.println("You entered in April!"); break;
      case "5": System.out.println("You entered in May!"); break;
      case "6": System.out.println("You entered in June!"); break;
      case "7": System.out.println("You entered in July!"); break;
      case "8": System.out.println("You entered in August!"); break;
      case "9": System.out.println("You entered in September!"); break;
      case "10": System.out.println("You entered in October!"); break;
      case "11": System.out.println("You entered in November!"); break;
      case "12": System.out.println("You entered in December!"); break;
      default: System.out.println("You need to enter in a valid month.");
    }
  }
}
