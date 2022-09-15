public class HogwartsStudent {
    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int ability(){
        return magic + transgression;
    }
    public void print(){
        System.out.println(this);
    }
    public void compareHogwarts(HogwartsStudent hogwartsStudent){
        int ability1 = ability();
        int ability2 = hogwartsStudent.ability();
        if ( ability1 > ability2){
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", getName(),
                    hogwartsStudent.getName(), ability1,ability2);
        }else if (ability2 > ability1){
            System.out.printf ("Студент %s лучше, чем студент %s: %d VS %d%n", hogwartsStudent.getName(),
                    getName(), ability1, ability2);
        }else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n",
                    hogwartsStudent.getName(), getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила транссгрессии: %d", name, magic, transgression);
    }
}
