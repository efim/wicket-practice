package xyz.restinmotion.learning;

/**
 * Created by efim on 25.06.16.
 */
public class DataDumpLOL {
    private String username;

    private String comment;
    private int age;

    public DataDumpLOL() {
        age = 0;
        username = "";
        comment = "";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
