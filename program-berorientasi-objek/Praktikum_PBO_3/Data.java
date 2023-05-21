package Praktikum_PBO_3;

public class Data {
    private String firstName, midName, lastName, nickName;
    private String birthPlace, birthDate;
    private String nim;
    
    public Data(){
        firstName = "M.";
        midName = "Hibatillah";
        lastName = "Hasanin";
        nickName = "Habib";
        birthPlace = "Pekanbaru";
        birthDate = "6 Mei 2003";
    }

    public String fullName(){
        String name = firstName + " " + midName + " " + lastName;
        return name;
    }

    public String birthDay(){
        String birth = birthPlace + " " + birthDate;
        return birth;
    }

    public static void main(String[] args) {
        Data me = new Data();

        System.out.println(me.fullName());
        System.out.println(me.birthDay());
    }
}
