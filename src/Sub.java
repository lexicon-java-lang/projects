public class Sub implements Contract {
    @Override
    public void calculateAmt() {


    }
    public void setnumbers(double princ, double rate){
        double pricipal=princ;
        double rates=rate;
        for (int day=1; day <= 20; day++){
            double amnt=pricipal*Math.pow(1+rate,day);
            System.out.println(day+"\t you will have\t"+amnt);
        }
    }
}
