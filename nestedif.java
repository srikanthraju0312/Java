/**
 * this program returns the tallest among three people
 */

class height {
    public static void main(String[] args) {
        int a,b,c;
        a = 187;
        b = 165;
        c = 157;
        System.out.println("The tallest among the three is:");
        if (a>b){
            if (a>c){
                System.out.println("Arun, he is "+a+"cm tall");
            }
            else{
                System.out.println("Prasad, he is "+c+"cm tall");
            }
        }
        else{
            if(c>b){
                System.out.println("Venky, he is "+c+"cm tall");
            }
            else{
                System.out.println("Prasad, he is "+b+"cm tall");
            }
        }
    }
}
