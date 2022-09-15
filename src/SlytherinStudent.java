public class SlytherinStudent extends HogwartsStudent{
    private int cunning;
    private int resolute;
    private int  ambitious;
    private int resourceful;
    private int thirstForPower;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int resolute,
                            int ambitious, int resourceful, int thirstForPower, int i) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.resolute = resolute;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getResolute() {
        return resolute;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setResolute(int resolute) {
        this.resolute = resolute;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    public int ability(){ return cunning + resolute + ambitious + resourceful + thirstForPower;}

    public void compareSlytherin(SlytherinStudent slytherinStudent){
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if ( ability1 > ability2){
            System.out.printf("Слизеринец %s лучше, чем Слизеринец %s: %d VS %d%n", getName(),
                    slytherinStudent.getName(), ability1, ability2);
        }else if (ability2 > ability1){
            System.out.printf("Слизеринец %s лучше, чем Слизеринец %s: %d VS %d%n",
                    slytherinStudent.getName(), getName(), ability1, ability2);
        }else {
            System.out.printf("Слизеринец %s такой же, как Слизеринец %s: %d VS %d%n",
                    slytherinStudent.getName(), getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format(" %s; хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d," +
                " жажда власти: : %d", super.toString(), cunning, resolute, ambitious, resourceful,
                thirstForPower);
    }

}
