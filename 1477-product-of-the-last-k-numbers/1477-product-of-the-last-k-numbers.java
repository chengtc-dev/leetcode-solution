class ProductOfNumbers {

    List<Integer> numbers;
    int size = 0;

    public ProductOfNumbers() {
        numbers = new ArrayList<>();
        numbers.add(1);
    }
    
    public void add(int num) {
        if (num == 0) {
            numbers = new ArrayList<>();
            numbers.add(1);
            size = 0;
        } else {
            numbers.add(num * numbers.get(size));
            size++;
        }
        
    }
    
    public int getProduct(int k) {
        if (k > size) return 0;

        return numbers.get(size) / numbers.get(size - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */