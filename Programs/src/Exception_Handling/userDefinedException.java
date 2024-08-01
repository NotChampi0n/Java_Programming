class negativeDimensionException extends Exception {
    public String toString(){
        return "Dimension Cannot be Negative.";
    }
    int area(int l, int b) throws negativeDimensionException{
        if(l<0 || b<0){
            throw new negativeDimensionException();
        }
        return l*b;
    }
}

public class userDefinedException {
    public static void main(String[] args) {
        negativeDimensionException nde = new negativeDimensionException();
        System.out.println(nde);
    }
}
