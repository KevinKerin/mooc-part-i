
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        if(cashGiven >= 2.5){
            cashInRegister += 2.5;
            economicalSold++;
            return cashGiven - 2.5;
        } else {
            return cashGiven;
        }        
    }
    
    public boolean payEconomical(LyyraCard card){
        if(card.balance() >= 2.5){
            economicalSold++;
            card.pay(2.5);
            return true;
        } else{
            return false;
        }
    }

    public double payGourmet(double cashGiven) {
        if(cashGiven >= 4){
            cashInRegister += 4;
            gourmetSold++;
            return cashGiven - 4;
        } else {
            return cashGiven;
        }
    }
    
    public boolean payGourmet(LyyraCard card){
        if(card.balance() >= 4){
            gourmetSold++;
            card.pay(4);
            return true;
        } else{
            return false;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum > 0){
            card.loadMoney(sum);
            cashInRegister += sum;
        } else {
            
        }
    }
    
}
