import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        broker b = new broker("Santosh", "Wadala", 10000);
        r_type room = new r_type("1bhk");
        location loca = new location("Wadala");
        preferance prefer = new preferance("Bachelor");
        facility facil = new facility("Furnished");

        float asu_rent = b.cal_rent(room.ro_type, loca.loc, prefer.pref, facil.fac);
        System.out.printf("The expected rent is %.2f", asu_rent);
    }
}

class broker {
    String Name;
    String location;
    int fee;

    public broker(String name, String location, int fee) {
        this.Name = name;
        this.location = location;
        this.fee = fee;
    }

    public float cal_rent(int room, int location, float pref, float fac) {
        float ans = room + (location * pref * fac) + fee;
        return ans;
    }
}

class customer {
    String name;
    int age;

    public customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class location {
    int loc;
    Map<String, Integer> locat = new HashMap<>();

    public location(String locName) {
        locat.put("Borivali", 30);
        locat.put("Wadala", 25);
        locat.put("Andheri", 50);
        locat.put("Bandra", 70);

        this.loc = locat.get(locName);
    }

    public int location(String loc) {
        return locat.get(loc);
    }
}

class preferance {
    float pref;
    Map<String, Double> prefe = new HashMap<>();

    public preferance(String prefName) {
        prefe.put("Bachelor", 3.0);
        prefe.put("Family", 4.5);

        this.pref = prefe.get(prefName).floatValue();
    }

    public float preferance(String pref) {
        return prefe.get(pref).floatValue();
    }
}

class r_type {
    int ro_type;
    Map<String, Integer> rr = new HashMap<>();

    public r_type(String roo_type) {
        rr.put("1rk", 10000);
        rr.put("1bhk", 15000);
        rr.put("2bhk", 20000);
        rr.put("3bhk", 50000);

        this.ro_type = rr.get(roo_type);
    }

    public int r_type(String roo_type) {
        return rr.get(roo_type);
    }
}

class facility {
    float fac;
    Map<String, Double> fur = new HashMap<>();

    public facility(String facName) {
        fur.put("Furnished", 2.0);
        fur.put("Unfurnished", 1.5);

        this.fac = fur.get(facName).floatValue();
    }

    public float facility(String fac) {
        return fur.get(fac).floatValue();
    }
}
