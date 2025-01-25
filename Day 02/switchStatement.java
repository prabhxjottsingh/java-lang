public class switchStatement {
    public static void main(String args[]){

        String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
       
        for(int i = 0; i < 7; i++){
            switch (day[i]) {
                case "Sunday", "Friday", "Saturday":
                    System.out.println("Weekend");
                    break;
            
                default:
                    System.out.println("Weekday");
                    break;
            }
        }

    }
}
