package TheEssenceOfJava.Ch7;

// 7-29,30 여러 종류의 객체를 배열로 다루기


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ch_29 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.money = 350000;
        buyer.buy(new Audio());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Tv());
        buyer.summary();
    }
}
class Product{
    int value; int BonusPoint;
    Product (int value){
        this.value = value;
        this.BonusPoint = value / 10;   // 10% 적립
    }
}
class Tv extends Product{
    Tv(){
        super(1000000); // 100만원
    }
}
class Computer extends Product{
    Computer(){
        super(500000); // 50만원
    }
}
class Audio extends Product{
    Audio(){
        super(100000); // 10만원
    }
}
class Buyer{
    int money;
    int point;
    ArrayList<Product> cart = new ArrayList<>();
    void buy(Product p){
        if(money < p.value){
            System.out.println("금액이 부족 합니다.");
            return;
        }
        money -= p.value;
        point += p.BonusPoint;
        cart.add(p);
    }
    void summary(){
        int sum = 0;    // 구매 금액
        int point = 0;  // 적립한 포인트
        HashMap<String , Integer> map = new HashMap<>();
        for (Product p : cart) {
            if(p instanceof Tv){
                map.put("TV", map.getOrDefault("TV", 0) + 1);
            }
            else if(p instanceof Computer){
                map.put("COMPUTER", map.getOrDefault("COMPUTER", 0) + 1);
            }
            else{
                map.put("AUDIO",  map.getOrDefault("AUDIO", 0) + 1);
            }
            sum += p.value;
            point += p.BonusPoint;
        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("구매 보고서").append("\n");
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("개").append(" ");
        }
        sb.append("\n");
        sb.append("사용한 금액: ").append(sum).append("원").append("\n");
        sb.append("누적된 포인트: ").append(point).append("원").append("\n");
        sb.append("물건을 구매해 주셔서 감사합니다");
        System.out.println(sb);
    }

}