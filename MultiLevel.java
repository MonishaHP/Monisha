class MultiLevel {
    void latest()
    {
        System.out.println("Latest modals");
    }
}
class bike extends MultiLevel{
    void ride(){
        System.out.println("Exclusive bikes");
    }
}
class honda extends bike{
    void milage(){
        System.out.println("Honda speed bike");
    }
}
class inherit{
    public static void main(String[] args){
        honda bike1=new honda();
        bike1.milage();
        bike1.ride();
        bike1.latest();

    }
}