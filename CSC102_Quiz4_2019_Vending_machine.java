import java.util.Scanner;

public class CSC102_Quiz4_2019_Vending_machine {
	public static void main(String args[]){
		VendingMachine vm = new VendingMachine();
		Product p1 = new Product("Pepsi", 13, 110);
		Product p2 = new Product("Coke", 13, 120);
		Product p3 = new Product("Fanta", 12, 130);
		Product p4 = new Product("Splash", 10, 140);
		Product p5 = new Product("Kit-kat", 15, 210);
		Product p6 = new Product("Snickers", 15, 220);
		Product p7 = new Product("Ferrero", 35, 230);
		Product p8 = new Product("vanhouten", 30, 240);
		Product p9 = new Product("Lay's", 25, 310);
		Product p10 = new Product("Testo", 20, 320);
		
		p1.setQuantity(20);
		p2.setQuantity(20);
		p3.setQuantity(20);
		p4.setQuantity(20);
		p5.setQuantity(20);
		p6.setQuantity(20);
		p7.setQuantity(20);
		p8.setQuantity(20);
		p9.setQuantity(20);
		p10.setQuantity(20);
		
		
		vm.addProduct(p1, 0);
		vm.addProduct(p2, 1);
		vm.addProduct(p3, 2);
		vm.addProduct(p4, 3);
		vm.addProduct(p5, 4);
		vm.addProduct(p6, 5);
		vm.addProduct(p7, 6);
		vm.addProduct(p8, 7);
		vm.addProduct(p9, 8);
		vm.addProduct(p10, 9);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++){
			vm.insertCoin(sc.nextInt());
		}
		System.out.println("---Inserted Money---");
		System.out.println(vm.getInsertedMoney());
		int pindex = sc.nextInt();
		int q = sc.nextInt();
		System.out.println("---Buy "+ q +" of "+vm.getProduct(pindex).getName()+" costs "+(vm.getProduct(pindex).getPrice()*q)+" baht---");
		System.out.println("---Change---");
		vm.buy(pindex, q);
	}
}

class Product{
	private int price;
	private String name;
	private int id; 
	private int quantity;
	
	public Product(String name, int price, int id){
		this.name = name;
		this.price = price;
		this.id = id;
		this.quantity = 0;
	}
	public int getPrice(){
	    return price;
	}
	public void setPrice(int price){
	    this.price = price;
	}
	public String getName(){
	    return name;
	}
	public void setName(String name){
	    this.name = name;
	}
	public int getId(){
	    return id;
	}
	public void setId(int id){
	    this.id = id;
	}
	public int getQuantity(){
	    return quantity;
	}
	public void setQuantity(int quantity){
	    this.quantity = quantity;
	}
}

class VendingMachine {
	private Product[] slots = new Product[10];
	private int[] coins = {0, 0, 0};
	private int insertedMoney = 0;
	private CoinProcessor cp = new CoinProcessor(100, 100, 100);
	
	public VendingMachine(){
	    
	}
    public void addProduct(Product product, int i){
        this.slots[i] = product;
    }
    public void removeProduct(int i){
        slots[i] = null;
    }
    public void addQuantity(int i, int quantity){
        slots[i].setQuantity(quantity + slots[i].getQuantity());
    }
    public Product getProduct(int i){
        return slots[i];
    }
    public int getInsertedMoney(){
        return insertedMoney;
    }
    public void buy(int i, int quantity){
        if(cp.returnChange(insertedMoney - (slots[i].getPrice() * quantity),coins) == false){
            System.out.println("Not enough change");
        }
    }
    public void insertCoin(int coin){
        insertedMoney += coin;
        if(coin == 1){
            this.coins[0] += 1;
        }else if(coin == 5){
            this.coins[1] += 1;
        }
        else if(coin == 10){
            this.coins[2] += 1; 
        }
    }
}

class CoinProcessor {
	private int onebahtCoin, fivebahtCoin, tenbahtCoin;
	
	public CoinProcessor(){
		this.onebahtCoin = 0;
		this.fivebahtCoin = 0;
		this.tenbahtCoin = 0;
	}
	public CoinProcessor(int one, int five, int ten){
		this.onebahtCoin = one;
		this.fivebahtCoin = five;
		this.tenbahtCoin = ten;
	}
	
	public boolean returnChange(int money, int[] coins){
	    int coinone = 0;
	    int coinfive = 0;
	    int cointen = 0;
	    this.onebahtCoin = coins[0];
	    this.fivebahtCoin = coins[1];
	    this.tenbahtCoin = coins[2];
	    
	    while(money > 0){
	        if(money >= 10){
	            this.tenbahtCoin -= 1;
	            cointen += 1;
	            money -= 10;
	        }else if(money >= 5){
	            this.fivebahtCoin -= 1;
	            coinfive += 1;
	            money -= 5;
	        }else if(money >= 1){
	            this.onebahtCoin -= 1;
	            coinone += 1;
	            money -= 1;
	        }
	    }
	    
	    System.out.println("One-baht Coin: " + coinone);
	    System.out.println("Five-baht Coin: " + coinfive);
	    System.out.println("Ten-baht Coin: " + cointen);
	    
	    if(money == 0){
	        return true;
	    }
	    return false;
	}
}