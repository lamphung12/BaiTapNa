package Model;

public class Users {
    private int id;
    private String password;
    private String username;
    private String status;
    private Role role;

    public Users() {
    }

    public Users(int id, String password, String username, String status, Role role) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.status = status;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Users{" +
                  id +","+
                password +","+
               username +"'"+
                 status +","+
                role.getId()
                +
                '}';
    }
}
