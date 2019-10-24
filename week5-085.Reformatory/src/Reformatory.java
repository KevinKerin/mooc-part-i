public class Reformatory {
    
    private int amountOfTimesWeighed = 0;

    public int weight(Person person) {
        amountOfTimesWeighed++;
        System.out.println(person.getName() + " weight: " + person.getWeight() + " kilos");
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    
    public int totalWeightsMeasured(){
        return amountOfTimesWeighed;
    }

}
