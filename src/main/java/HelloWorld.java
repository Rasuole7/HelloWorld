public class HelloWorld {

    String vardas;
    String pavarde;
    int amzius;


    public HelloWorld (String vardas, String pavarde, int amzius){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
    }

    public String getVardas(){
        return vardas;
    }

    public String getPavarde(){
        return pavarde;
    }

    public int getAmzius(){
        return amzius;
    }

    public static void main(String[] args){
       HelloWorld objektas = new HelloWorld("Onute", "Kerbedyte", 20);
        System.out.println("Zmogus: " + objektas.getVardas() + " "+ objektas.getPavarde() + ", metai: " + objektas.getAmzius());


    }
}
