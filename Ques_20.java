// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Program {
 
    static void converter(int args){
        System.out.println(Math.abs(args));
    }

    void doAction(){

        List<Integer> numbers = Arrays.asList(5,-3,2,4,-9,7,4);
        numbers.forEach(Program::converter);
    }
    
}

public class Test0 {
    public static void main(String[] args) {
        
        Program obj= new Program();
        obj.doAction();
    }
}
