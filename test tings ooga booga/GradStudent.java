public class GradStudent extends Student{
    public String getFood(){
        return "taco";
    }
    public String getInfo(){
        super.getInfo();
        return "eating";
    }
}
