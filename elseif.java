/**
 * This program categorizes cars into segments based upon their pricing
 * Using else if ladder
 */
class segment {
    public static void main(String[] args) {
        String[] model = {"Alto","i20","Honda City","Volkswagen Virtus","Toyota Innova","Toyota Fortuner","BMW 5 Series","Porsche Cayenne"};
        int[] pricing = {548000,989000,1607000,1954000,3456789,4898765,8103024,18345209};
        for(int i=0;i<pricing.length;i++){
            if(pricing[i]<1000000){
                System.out.println(model[i]+" is an entry level car");
            }
            else if(pricing[i]<3500000){
                System.out.println(model[i]+" is a mid-segment car");
            }
            else if(pricing[i]<5000000){
                System.out.println(model[i]+" is an entry-level luxury car");
            }
            else if(pricing[i]<10000000){
                System.out.println(model[i]+" is a mid-luxury car");
            }
            else{
                System.out.println(model[i]+" is a luxury car");
            }
        }
    }
}
