public class Account {
    int id = 0;
    int userID = 0;
    int Amount = 0;

    public Account( User user, int amount) {
        this.id ++;
        this.userID = user.getUserID();
        Amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
}
