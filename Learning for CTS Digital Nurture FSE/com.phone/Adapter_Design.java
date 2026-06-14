interface Pen {
    void write(String str);
}
class AssignmentWork {
    private Pen p;
    public Pen getP() {
        return p;
    }
    public void setP(Pen p){
        this.p = p;
    }
    public void writeAssignment(String str){
        p.write(str);
    }
}

class PilotPen {
    public void marker(String str){
        System.out.println("I have to write this statement: \n"+str);
    }
}
class PenAdapter implements Pen {
    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        pp.marker(str);
    }
}
public class Adapter_Design {
    public static void main(String[] args) {
        PenAdapter pp = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(pp);
        aw.writeAssignment("I am bit tired to write an assignment");
    }
}