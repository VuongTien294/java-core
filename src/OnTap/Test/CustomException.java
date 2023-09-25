package OnTap.Test;

public class CustomException extends Exception{
    int num;

    CustomException(int n){
        num = n;
    }

    public String toString(){
        return Integer.toString(num);
    }
}

class ExecutingClass{
    static void calculate (int n) throws CustomException{
        throw new CustomException(n);
    }

    public static void main(String[] args) {
        try {
            calculate(24);
        }catch (CustomException e){
            System.out.println("Catch22");
        }
    }
}
