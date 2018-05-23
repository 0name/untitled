public class User {
    private static int num = 0;
    public final int UserID;

    public User() {
        num++;
        UserID = num;
    }

    public int getUserID() {
        return UserID;
    }

}
