package III.Collections.Map;

public class LangKeyNotOverrideEquals {
    private int index;
    private String name;

    public LangKeyNotOverrideEquals(int index, String Name) {
        this.index = index;
        this.name = Name;
    }

    @Override
    public int hashCode(){
        return 5;
    }

}
