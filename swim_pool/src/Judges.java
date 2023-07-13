class Judges extends People{
    private String name;
    private int IdNumber;
    private static int num_judges;

    public static int getNum_judges() {
        return num_judges;
    }
    public static void setNum_judges(int num_judges) {
        Judges.num_judges = num_judges;
    }

    Judges(String Name,int idNumber ){
        super();
        name=Name;
        IdNumber=idNumber;
        setNum_judges(getNum_judges()+1);
        System.out.println("new judge person created.Totally there are "+getNum_judges()+" judges.\n");
    }

    void blow(){
        System.out.println("Judge is blowing the whistle.");
    }
    @Override
    void CheckScoreBoard() {
        System.out.print("Judge is ");
        super.CheckScoreBoard();
    }

}
