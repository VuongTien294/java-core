package III.Collections.Map;

public class LangKey {
    private int index;
    private String name;

    public LangKey(int index, String Name) {
        this.index = index;
        this.name = Name;
    }

    @Override
    public int hashCode(){
        return 5;
    }

    @Override
    public boolean equals(Object obj) {
        return true ;
    }
}
