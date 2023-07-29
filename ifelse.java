/**This program prints whether the given set of lengthes and breadths can make a square or not */
class square
{
    public static void main(String[] args) {
        int[] l = {4,5,3,8,6,7,9};
        int[] b = {6,5,3,9,4,8,7};
        for(int i= 0;  i <= 9; i++){
                if(l[i]==b[i]){
                    System.out.println(l[i]+","+b[i]+" can make a square");
                }
                else{
                    System.out.println(l[i]+","+b[i]+" Sorry!, cannot make a square");
                }
            }
        }

    }
