public class Multiply implements Calculate{

    @Override
    public void calculate(String[] numbers) {
        int product = 1;
        for(int i = 0; i < numbers.length; i++){
            product = product * Integer.parseInt(numbers[i]);
        }
        System.out.println(product);
    }
}
