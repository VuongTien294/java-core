package OnTap.Test;

public class HoldingReferences {
}

class Hold{
    int id;
    Hold x;

    Hold(int amount, Hold h){
        id = amount;
        x = this;
        if(h != null){
            x = h;
        }
    }

    void go(Hold h2){
        Hold h3 = new Hold(2, h2);
        Hold h4 = new Hold(3, h3);
        System.out.println(h4.x.x.id);
    }

    public static void main(String[] args) {
        Hold h1 = new Hold(1, null);
        h1.go(h1);
    }
}