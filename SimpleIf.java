/**To check whether students are pass or fail
 * if they are into sports then make the fail students pass
 */

class marks
{
    public static void main(String[] args) {
        int i,p,f,t;
        float[] mark = {78.5F, 34.5F, 20.0F, 45.7F, 58.9F};
        String[] sports = {"Y","N","Y","N","N"};
        p = 0;
        f = 0;
        t = 0;

        for(i=0;i<=4;i++){
            if (mark[i]<35 && sports[i] == "N"){
                f = f+1; //getting the fail count
            }
            t = t+1; //the total students    
            p = t-f;
            

        }
        System.out.println("The no. of students passed the exam are "+p);
        System.out.println("The no of students who failed are "+f); 
        
    }
}