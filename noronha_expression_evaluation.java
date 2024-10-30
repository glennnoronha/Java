public class noronha_expression_evaluation {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 9, d = 6, e = 4;
        
        int exprA = ((a * b) - 1) + c;
        System.out.println("Expression a: " + exprA);
        
        int exprB = ((a * (b - 1)) / c) % d;
        System.out.println("Expression b: " + exprB);
        
        int exprC = ((a - b) / c) & ((d * e / a) - 3);
        System.out.println("Expression c: " + exprC);

        boolean exprD = (-a != 0) || ((c == d) && (e != 0));
        System.out.println("Expression d: " + exprD);
        
        boolean exprE = ((a > b) ^ (c != 0)) || (d <= 17);
        System.out.println("Expression e: " + exprE);
        
        int exprF = (-a) + b;
        System.out.println("Expression f: " + exprF);
    }
}
