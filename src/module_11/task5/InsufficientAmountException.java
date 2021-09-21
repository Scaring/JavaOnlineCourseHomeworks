package module_11.task5;

class InsufficientAmountException extends Exception{
    private double amount;
    
    InsufficientAmountException(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    
    public String getMessage(){
        return "Sorry, but you are short $" + amount;
    }
}
