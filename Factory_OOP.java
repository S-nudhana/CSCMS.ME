class Factory{
    public double iron;
    public double copper;
    public double silver;
    public double gold;
    public int board;
    
    public Factory(double i, double c, double s, double g){
        iron = i;
        copper = c;
        silver = s;
        gold = g;
    }
    public double getIron(){
        return iron;
    }
    public double getCopper(){
        return copper;
    }
    public double getSilver(){
        return silver;
    }public double getGold(){
        return gold;
    }
    public void buildCircuitBoard(int b){
        copper -= (5.00 * b) / (1000 * 1000);
        silver -= (2.00 * b) / (1000 * 1000);
        gold -= (0.01 * b) / (1000 * 1000);
        board += b;
    }
    public int getCircuitBoard(){
        return board;
    }
}

public class Factory_OOP{
    public static void main(String[] args) {
        Factory fac1 = new Factory(67,9,10,1);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());

        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
        fac1.buildCircuitBoard(500000);
        fac1.buildCircuitBoard(850000);
        System.out.println(fac1.getIron());
      	System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());
        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
    }
}