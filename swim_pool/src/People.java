class People{
    private String name;
    private int IdNumber;
    private static int count;
    People(){
        setCount(getCount()+1);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIdNumber() {
        return IdNumber;
    }
    public void setIdNumber(int idNumber) {
        IdNumber = idNumber;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        People.count = count;
    }

    void CheckScoreBoard(){
        System.out.println("Checking the scoreboard");
    }
}
