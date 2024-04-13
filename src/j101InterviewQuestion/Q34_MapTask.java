import java.util.*;

public class Q34_MapTask {
    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir map oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul

    public static void main(String[] args) {
        Map<String,String[]>groups=new HashMap<String,String[]>();
        groups.put("Grup1",new String[]{"üye1", "üye2", "üye3", "üye4"});
        groups.put("Grup2",new String[]{"üye5", "üye6", "üye7"});
        System.out.println("Grup1 üye sayısı: "+groups.get("Grup1").length);
        System.out.println("Grup2 üye sayısı: "+groups.get("Grup2").length);

    }
}

