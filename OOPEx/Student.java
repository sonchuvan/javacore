package OOPEx;

public class Student {
    private int id;
    private String name;
    private float theoreticalPoint,practicePoint;
    public static int count;

    Student(){
        id = 0;
        name = "";
        theoreticalPoint = 0;
        practicePoint = 0;
    }
    Student(int id,String name,float tPoint,float pPoint){
        this.id = id;
        this.name = name;
        this.practicePoint = pPoint;
        this.theoreticalPoint = tPoint;
        count++;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param practicePoint the practicePoint to set
     */
    public void setPracticePoint(float practicePoint) {
        this.practicePoint = practicePoint;
    }
    /**
     * @return the practicePoint
     */
    public float getPracticePoint() {
        return practicePoint;
    }
    /**
     * @param theoreticalPoint the theoreticalPoint to set
     */
    public void setTheoreticalPoint(float theoreticalPoint) {
        this.theoreticalPoint = theoreticalPoint;
    }
    /**
     * @return the theoreticalPoint
     */
    public float getTheoreticalPoint() {
        return theoreticalPoint;
    }

    public float mediumScore(){
        return (theoreticalPoint+practicePoint)/2;
    }
    public String toString(){
        return "ID: "+id+"\n Name: "+name+"\nPPoint: "+practicePoint+"\nTPoint: "
        +theoreticalPoint+"\nMedium Score: "+this.mediumScore();
    }
    
}
