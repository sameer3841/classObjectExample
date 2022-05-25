package saunak.patel.ep2;

public class BTeacher extends BPerson{

    private boolean fulltime;

    public BTeacher(String Name, int Age, boolean fulltime){
        super(Name, Age);
        this.fulltime = fulltime;
    }

    public boolean isFulltime(){
        return fulltime;
    }

    public void setFulltime(boolean f){
        this.fulltime = f;
    }

    @Override
    public String toString(){

        String fp = fulltime? "full-time" : "part-time";
        return String.format("%s and they work %s",super.toString(),fp);

    }
}
