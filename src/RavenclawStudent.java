public class RavenclawStudent extends HogwartsStudent{
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public RavenclawStudent(String name, int magic, int transgression, int  smart, int wise, int witty, int i, int nextInt) {
        super(name, magic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getTalented() {
        return creative;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setTalented(int talented) {
        this.creative = talented;
    }
    public int ability(){ return smart + wise + witty + creative;}

    public void compareRavenclaw(RavenclawStudent ravenclawStudent){
        int ability1 = ability();
        int ability2 = ravenclawStudent.ability();
        if ( ability1 > ability2){
            System.out.printf("Когтевранец %s лучше, чем Когтевранец %s: %d VS %d%n", getName(),
                    ravenclawStudent.getName(), ability1, ability2);
        }else if (ability2 > ability1){
            System.out.printf("Когтевранец %s лучше, чем Когтевранец %s: %d VS %d%n",
                    ravenclawStudent.getName(), getName(), ability1, ability2);
        }else {
            System.out.printf("Когтевранец %s такой же, как Когтевранец %s: %d VS %d%n",
                    ravenclawStudent.getName(), getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format(" %s; ум: %d; мудрость: %d; остроумие: %d; творчество: %d",
                super.toString(), smart, wise, witty, creative);
}}
