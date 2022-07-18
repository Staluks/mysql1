import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DBlogic db = new DBlogic();
        System.out.println("Insert(i)/Delete(d)/Update(u)/Select all list(s)");
        String action = scan.next();
        switch (action.toLowerCase()) {
            case "i":
                db.getInsert();
                break;
            case "d":
                db.getDelete();
                break;
            case "u":
                db.getUpdate();
                break;
            case "s":
                db.getSelect();
                break;
        }



    }
}