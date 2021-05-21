package TaskC;

public class TexhnicDepartament extends Departament{

    public TexhnicDepartament(String name){
        super(name);
    }


    String tehnicItems(){
        // я думал чтобы сделать данный параметр через boolean
        // но решил остановится на данном методе так как считаю его более логичным
        return "В данном отделе есть компьютер.";
    }

    @Override
    public String toString(){
        return String.format("%s" +
                "%s",super.toString(),tehnicItems());
    }
}
