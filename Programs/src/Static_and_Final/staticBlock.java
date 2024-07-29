class staticBlocks{
    static {
        System.out.println("Static Block 1 - Inside Class staticBlocks.");
    }
    static {
        System.out.println("Static Block 2 - Inside Class staticBlocks.");
    }
}

public class staticBlock {
    public static void main(String[] args) {
        System.out.println("Main Block");
        staticBlocks sb1 = new staticBlocks();
    }
//    static {
//        System.out.println("Static Block 1 - Before the main method");
//    }

//    static {
//        System.out.println("Static Block 2 - After the main method");
//    }
}
