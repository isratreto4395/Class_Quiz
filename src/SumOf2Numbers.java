//Write a Java program to print the sum of two numbers. Test Data: 84 + 35 Expected Output : 119

public class SumOf2Numbers {
    public int sum(int num1,int num2){
        return num1+ num2;
    }



    public static void main(String[] args) {
        SumOf2Numbers num = new SumOf2Numbers();
        System.out.println(num.sum(84, 35));

    }

    }