import java.util.ArrayList;

public class MyStack {
    ArrayList<String> entries = new ArrayList<>();

    public MyStack(){

    }

    public String peek(){
        return entries.get(this.size()-1);
    }

    public String pop(){
        String ret = entries.get(this.size()-1);
        entries.remove(this.size()-1);
        return ret;
    }

    public void push( String ele ){
        entries.add(ele);
    }

    public int size(){
        return entries.size();
    }

}
