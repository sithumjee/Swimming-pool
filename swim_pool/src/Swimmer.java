class Swimmer extends People {
    private String name;
    private int IdNumber;
    private static int num_swimmers;
    public static int getNum_swimmers() {
        return num_swimmers;
    }
    public static void setNum_swimmers(int num_swimmers) {
        Swimmer.num_swimmers = num_swimmers;
    }

    Swimmer(String Name,int idNumber ){
        super();
        name=Name;
        IdNumber=idNumber;
        setNum_swimmers(getNum_swimmers()+1);
        System.out.println("new swimmer person created.Totally there are "+getNum_swimmers()+" swimmers.\n");
    }
    void swim(){
        System.out.println("Swimmers started to swim. ");
    }

    void endswim(){
        System.out.println("Swimmers ended  swim. ");

    }

    @Override
    void CheckScoreBoard() {
        System.out.print("Swimmer is ");
        super.CheckScoreBoard();
    }
}
