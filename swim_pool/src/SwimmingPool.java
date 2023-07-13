public class SwimmingPool {
    public static void main(String[] args) {
        Swimmer swimmer=new Swimmer("saman",1000);
        Swimmer swimmer1=new Swimmer("nimal",10030);
        Judges judge=new Judges("rabukwella",1001);
        System.out.println("Total number of people: "+People.getCount()+"\n");
        judge.blow();
        swimmer.swim();
        swimmer.endswim();
        judge.CheckScoreBoard();
        swimmer.CheckScoreBoard();


    }
}